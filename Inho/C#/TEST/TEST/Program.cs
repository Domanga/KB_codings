using System;

namespace TEST
{
    class Program
    {
        //var a = 0;                   전역변수, 인스턴스 변수에는 var 키워드 사용 불가능
        static void Main(string[] args)
        {
            string[] str_arr = { "바나나", "사과", "망고", "포도", "딸기" };
            Console.WriteLine("Hello World!");
            Console.WriteLine(3 + 5 * 2);
            Console.WriteLine('\\');
            Console.WriteLine('가' + '나');
            Console.WriteLine("가나" + "다라");
            Console.WriteLine(int.MaxValue);
            Console.WriteLine(int.MinValue);
            //Console.WriteLine(sizeof(String));
            Console.WriteLine(int.Parse("32"));
            Console.WriteLine((32.7).ToString());

            for (int i = 0; i < str_arr.Length; i++)
            {
                Console.WriteLine(str_arr[i]);
            }

            foreach (var item in str_arr)
            {
                Console.WriteLine(item);
            }

            string a = "i wish your marrychristmas!";
            Console.WriteLine(a.ToUpper());


        }
    }
}
