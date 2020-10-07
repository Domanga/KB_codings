using System;

namespace Movie
{
    public class MovieList
    {
        private String title;
        private String genre;
        private String r_time;

        public string Title { get => title; set => title = value; }
        public string Genre { get => genre; set => genre = value; }
        public string R_time { get => r_time; set => r_time = value; }
    }
}
