using MySql.Data.MySqlClient;
using System;
using System.Windows.Forms;

namespace Movie
{
    public partial class Form1 : Form
    {
        static int islogin1 = 0;
        static string id = null;
        Login log = new Login();
        Login.islogin loged = new Login.islogin();

        public MovieList movie;
        public TicketList ticketlist;
        private Ticket ticket;
        public MemberVo member;

        public MySqlConnection connectionForm1;
        MySqlCommand cmd;
        MySqlDataReader rdr;

        public Form1(int islog1, string ID)
        {
            movie = new MovieList();
            ticketlist = new TicketList();
            member = new MemberVo();

            islogin1 = islog1;
            InitializeComponent();
            Initialization();
            connectionForm1 = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=1111");
            connectionForm1.Open();
            id = ID;
            member.Id = id;
            ID_text.Text = id + "님";

            if (islogin1 == 1)
            {
                login_btn.Visible = false;
                out_btn.Visible = true;
            }
            else
            {
                login_btn.Visible = true;
                out_btn.Visible = false;
            }
        }

        public void Initialization()
        {
            ID_text.Text = id + "님";
            if (islogin1 == 1)
            {
                login_btn.Visible = false;
                out_btn.Visible = true;
            }
            else
            {
                login_btn.Visible = true;
                out_btn.Visible = false;
            }
        }

        private void login_btn_Click(object sender, EventArgs e)
        {
            if (islogin1 == 0)
            {
                Login login = new Login();
                login.Show(this);
            }
            else
            {
                MessageBox.Show("로그아웃 되었습니다.");
                islogin1 = 0;
                id = "";
            }
        }
        private void out_btn_Click(object sender, EventArgs e)
        {
            MessageBox.Show("로그아웃 되었습니다.");
            islogin1 = 0;
        }
        private void exit_btn_Click(object sender, EventArgs e)
        {
            this.Close();

        }

        private void reFresh_btn_Click(object sender, EventArgs e)
        {
            Initialization();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox_click(object sender, EventArgs e)
        {
            if (String.IsNullOrEmpty(id) == false)
            {
                PictureBox t = sender as PictureBox;
                string s = t.Name;
                switch (s)
                {
                    case "tenet":
                        MessageBox.Show("테넷");
                        break;
                    case "endgame":
                        MessageBox.Show("엔드게임");
                        break;
                    case "extraction":
                        MessageBox.Show("익스트랙션");
                        break;
                    case "darkknight":
                        MessageBox.Show("다크나이트:라이즈");
                        break;
                    case "knivesOut":
                        MessageBox.Show("나이브스아웃");
                        break;
                    case "search":
                        MessageBox.Show("서치");
                        break;
                    case "goksung":
                        MessageBox.Show("곡성");
                        break;
                    case "savaha":
                        MessageBox.Show("사바하");
                        break;
                    case "titanic":
                        MessageBox.Show("타이타닉");
                        break;
                    case "loveactually":
                        MessageBox.Show("러브액츄얼리");
                        break;
                    case "extremejob":
                        MessageBox.Show("극한직업");
                        break;
                    case "threeidiot":
                        MessageBox.Show("세 얼간이");
                        break;

                }
                movie.Title = s;                         // 영화 제목
                ticketlist.Title = s;

                ticket = new Ticket(this, id);           // 티켓폼 이동
                ticket.Show();
            }
            else
            {
                MessageBox.Show("로그인 후 이용이 가능합니다.");
            }
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void search_btn_Click(object sender, EventArgs e)
        {
            if (String.IsNullOrEmpty(id) == false)
            {
                string search_movie = search_text.Text;

                movie.Title = search_movie;
                ticketlist.Title = search_movie;

                ticket = new Ticket(this, id);
                ticket.Show();

                search_text.Text = "";
            }
            else
            {
                MessageBox.Show("로그인 후 이용이 가능합니다.");
            }
        }

        private void myTicket_Click(object sender, EventArgs e)
        {
            if (String.IsNullOrEmpty(id) == false)
            {
                cmd = new MySqlCommand();
                cmd.Connection = connectionForm1;
                cmd.CommandText = "SELECT * FROM movie.ticket WHERE cus_ID = '" + id + "'";
                rdr = cmd.ExecuteReader();

                string ticket_stat = id + "님의 예매 현황\n\n";

                while(rdr.Read())
                {
                    ticket_stat +=   rdr[1].ToString() + "   /   " + rdr[2].ToString() + "   /   " 
                                   + rdr[3].ToString() + "   /   " + rdr[4].ToString() + "입니다. \n";
                }
                MessageBox.Show(ticket_stat);
            }
            else
            {
                MessageBox.Show("로그인 후 이용이 가능합니다.");
            }
        }
    }
}
