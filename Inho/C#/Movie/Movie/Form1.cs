using System;
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
    public partial class Form1 : Form
    {
        static int islogin1 = 0;
        static string id = "";
        Login log = new Login();
        Login.islogin loged = new Login.islogin();

        public Form1(int islog1, string ID)
        {
            islogin1 = islog1;
            InitializeComponent();
            Initialization();
            MySqlConnection connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=0506");
            connection.Open();
            id = ID;
        }
       
        public void Initialization()
        {
            ID_text.Text = id+ "님";
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
                login.Show();
            }
            else
            {
                MessageBox.Show("로그아웃 되었습니다.");
                islogin1 = 0;
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

        private void button14_Click(object sender, EventArgs e)
        {
            MessageBox.Show(islogin1.ToString());
            Initialization();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void pictureBox_click(object sender, EventArgs e)
        {
            PictureBox t = sender as PictureBox;
            string s = t.Name;
            switch(s)
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
                case "knivesout":
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

            Ticket ticket = new Ticket();
            ticket.Show();
        }
    }
}
