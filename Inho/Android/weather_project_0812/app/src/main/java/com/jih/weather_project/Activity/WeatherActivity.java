package com.jih.weather_project.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jih.weather_project.R;
import com.jih.weather_project.model.MyWeather;
import com.jih.weather_project.util.GetXmlTask;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class WeatherActivity extends AppCompatActivity {
    Button startWeather;
    TextView weatherInfo;
    ArrayList<MyWeather> weatherArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        setTitle("날씨 정보");

        startWeather = findViewById(R.id.startWeather);
        weatherInfo = findViewById(R.id.weatherInfo);

//        startWeather.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                GetXmlTask task = new GetXmlTask((MainActivity.this);
//                task.execute("http://www.kma.go.kr/wid/queryDFS.jsp?gridx=89&gridy=90");
//            }
//        });
    }
    /*
    private class GetXmlTask extends AsyncTask<String, Void, Document> {
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

                weatherArrayList.add(new MyWeather(strDate, time, temp, reh, pop, weather));
            }
            weatherInfo.setText(s);


            Intent intent = new Intent(getApplicationContext(),WeatherView.class);
            intent.putExtra("MyWeather",weatherArrayList);
            startActivity(intent);
        }
    }
    */
}