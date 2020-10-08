using MySql.Data.MySqlClient;
using System;
using System.Drawing;
using System.Windows.Forms;

namespace Movie
{
    public partial class Ticket : Form
    {
        private Form1 form1;
        public MovieList movie;
        public Ticket ticket;
        public TicketList ticketlist;
        public MemberVo member;

        private Seat seat;

        public static string title, id;

        public MySqlConnection connectionTicket;
     
        public Ticket(Form1 form1, String ID)
        {
            InitializeComponent();
            
            this.form1 = form1;
            movie = this.form1.movie;
            ticketlist = this.form1.ticketlist;
            member = this.form1.member;

            connectionTicket = this.form1.connectionForm1;

            title = movie.Title;
            id = ID;

            // movie_image.Image = new Bitmap("Movie.Properties." + title + ".jpg");
            movie_image.Load(@"C:\Users\KB\Documents\Git\KB_codings\Inho\C#\Movie\Movie\Properties\" + title + ".jpg");
            movie_image.SizeMode = PictureBoxSizeMode.StretchImage;
            movie_title.Text = title;
            movie_date.Value = DateTime.Today;
        }

        private void ticket_btn_Click(object sender, EventArgs e)
        {
            seat = new Seat(this, id);
            seat.Show();
        }

        private void movie_date_ValueChanged(object sender, EventArgs e)
        {
            DateTime movie_time = movie_date.Value;
            String movie_date_time = movie_time.ToString("yyyy-MM-dd");
            ticketlist.Date = movie_date_time;
        }

        private void time_CheckedChanged(object sender, EventArgs e)
        {
            CheckBox checkBox = sender as CheckBox;
            switch(checkBox.Name)
            {
                case "AM_time":
                    PM_time.Enabled = false;
                    ticketlist.Time = "AM 10:00";
                    if(AM_time.Checked == false)
                    {
                        PM_time.Enabled = true;
                    }
                    break;
                case "PM_time":
                    AM_time.Enabled = false;
                    ticketlist.Time = "PM 04:00";
                    if(PM_time.Checked == false)
                    {
                        AM_time.Enabled = true;
                    }
                    break;
            }
        }

        private void signExit_btn_Click(object sender, EventArgs e)
        {
            this.Close();
        }

    }
}
