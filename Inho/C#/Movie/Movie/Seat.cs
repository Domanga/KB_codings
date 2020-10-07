using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;


namespace Movie
{
    public partial class Seat : Form
    {
        private Decimal cus_Num;
        private Decimal count = 1;

        public Ticket ticket;
        public TicketList ticketlist;
        public MemberVo member;

        private String seat;

        public static String id;

        public static ArrayList seatList;

        public static string[] piece;

        MySqlConnection connectionSeat;
        MySqlCommand cmd;
        MySqlDataReader rdr;

        public Seat(Ticket ticket, String ID) {
            this.ticket = ticket;
            ticketlist = this.ticket.ticketlist;
            member = this.ticket.member;

            id = ID;

            InitializeComponent();

            seat_panel.Enabled = false;

            connectionSeat = this.ticket.connectionTicket;
            string query = "SELECT seat FROM movie.ticket WHERE title = '" + ticketlist.Title + "' AND date = '" + ticketlist.Date + "' AND time = '" + ticketlist.Time + "'";

            cmd = new MySqlCommand(query, connectionSeat);
            rdr = cmd.ExecuteReader();
            seatList = new ArrayList();
            while (rdr.Read())
            {
                string temp = rdr[0].ToString();
                piece = temp.Split(new char[] { ',' });
                for (int i = 0; i < piece.Length; i++)
                {
                    MessageBox.Show(piece[i]);
                }
            }

        }

        private void Cus_num_ValueChanged(object sender, EventArgs e)
        {
            cus_Num = Cus_num.Value;
            count = 1;
            seat_panel.Enabled = true;
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Exit_btn_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void Seat_CheckedChanged(object sender, EventArgs e)
        {
            CheckBox list = sender as CheckBox;

            for (int i = 0; i < piece.Length; i++)
            {
                if (list.Name == piece[i])
                {
                    list.Enabled = false;
                }
            }

            if (cus_Num > 0)
            {
                if (count <= cus_Num)
                {
                    if (count == cus_Num)
                    {
                        seat_panel.Enabled = false;
                    }
                    count++;
                    seat += list.Name +",";
                }
            }


        }

        private void ticket_btn_Click(object sender, EventArgs e)
        {
            CheckBox list = sender as CheckBox; 
            ticketlist.Seat = seat;
            //MySqlConnection connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=1111");
            //connection.Open();
            string query = "INSERT INTO movie.ticket VALUES('" + id + "', '" + ticketlist.Title + "', '" + ticketlist.Date + "' , '" + ticketlist.Time + "' , '" + ticketlist.Seat + "')";
            try
            {
                MySqlCommand command = new MySqlCommand(query, connectionSeat);
                if (command.ExecuteNonQuery() == 1)
                {
                    MessageBox.Show("예매되었습니다..");
                    this.Close();
                }
                else
                {
                    MessageBox.Show("버그다");
                }
            }
            catch (Exception)
            {
                MessageBox.Show("에러");
            }
        }
    }
}
