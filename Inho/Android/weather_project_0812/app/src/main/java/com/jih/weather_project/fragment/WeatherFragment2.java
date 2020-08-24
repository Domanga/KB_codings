package com.jih.weather_project.fragment;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.jih.weather_project.R;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.net.URL;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class WeatherFragment2 extends Fragment {
    Button getWeather;
    TextView showWeather;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_weather2, container, false);
        getWeather = rootView.findViewById(R.id.startWeather2);
        showWeather = rootView.findViewById(R.id.weatherInfo2);

        getWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetXmlTaskFrag task = new GetXmlTaskFrag();
                task.execute("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=98&gridy=76");
            }
        });

        return rootView;
    }

    private class GetXmlTaskFrag extends AsyncTask<String, Void, Document> {
        Document doc = null;

        @Override
        protected Document doInBackground(String... strings) {
            URL url;
            try {
                url = new URL(strings[0]);
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                doc = db.parse(new InputSource(url.openStream()));
                doc.getDocumentElement().normalize();
            }
            catch(Exception e) {
                Log.d("GetXmlTask", "Xml 파싱 에러: " + e.getMessage());
            }
            return doc;
        }

        @Override
        protected void onPostExecute(Document document) {
            super.onPostExecute(document);

            String s = "";
            NodeList nodeList = doc.getElementsByTagName("data");
            Calendar cal = Calendar.getInstance();
            int year = cal.get(cal.YEAR);
            int month = cal.get(cal.MONTH) +1 ;
            int date = cal.get(cal.DATE);
            String strDate = null;

            for(int i=0;i<nodeList.getLength();i++) {
                s += "" + i + ": 날씨 정보 : ";
                Node node = nodeList.item(i);
                Element fstElmnt = (Element) node;

                NodeList day = fstElmnt.getElementsByTagName("day");
                Element dayElement = (Element) day.item(0);
                day = dayElement.getChildNodes();
                switch(day.item(0).getNodeValue()) {
                    case "0":
                        strDate = String.format("%d년 %d월 %d일", year, month, date);
                        Log.d("onPostExcute","오늘 날짜: "+ strDate);
                        break;
                    case "1":
                        strDate = String.format("%d년 %d월 %d일", year, month, date+1);
                        Log.d("onPostExcute","내일 날짜: "+ strDate);
                        break;
                    case "2":
                        strDate = String.format("%d년 %d월 %d일", year, month, date+2);
                        Log.d("onPostExcute","모레 날짜: "+ strDate);
                        break;
                }

                s += "날짜 = " + strDate + ", ";

                NodeList hourList = fstElmnt.getElementsByTagName("hour");
                Element hourElement = (Element) hourList.item(0);
                hourList = hourElement.getChildNodes();
                String time = hourList.item(0).getNodeValue();
                s += "시간 = " + time + ", ";

                NodeList tempList = fstElmnt.getElementsByTagName("temp");
                Element tempElement = (Element) tempList.item(0);
                tempList = tempElement.getChildNodes();
                String temp = tempList.item(0).getNodeValue();
                s += "온도 = " + temp + ", ";

                NodeList rehList = fstElmnt.getElementsByTagName("reh");
                Element rehElement = (Element) rehList.item(0);
                rehList = rehElement.getChildNodes();
                String reh = rehList.item(0).getNodeValue();
                s += "습도 = " + reh + ", ";

                NodeList popList = fstElmnt.getElementsByTagName("pop");
                Element popElement = (Element) popList.item(0);
                popList = popElement.getChildNodes();
                String pop = popList.item(0).getNodeValue();
                s += "강수확률 = " + pop + ", ";

                NodeList weatherList = fstElmnt.getElementsByTagName("wfKor");
                Element weatherElement = (Element) weatherList.item(0);
                weatherList = weatherElement.getChildNodes();
                String weather = weatherList.item(0).getNodeValue();
                s += "날씨 = " + weather + "\n";
            }
            showWeather.setText(s);
        }
    }
}