using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Movie
{
    public class TicketList
    {
        private String m_title;
        private String m_date;
        private String m_time;
        private String m_seat;

        public string Seat { get => m_seat; set => m_seat = value; }
        public string Time { get => m_time; set => m_time = value; }
        public string Date { get => m_date; set => m_date = value; }
        public string Title { get => m_title; set => m_title = value; }
    }
}
