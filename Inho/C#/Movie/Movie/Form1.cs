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
        static int islogin = 0;
        public Form1()
        {
            InitializeComponent();
            Initialization();
            MySqlConnection connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=0506");
            connection.Open();
        }
       
        public void Initialization()
        {
        }

        private void login_btn_Click(object sender, EventArgs e)
        {
            if (islogin == 0)
            {
                Login login = new Login();
                login.Show();
            }
            else
            {
                MessageBox.Show("로그아웃 되었습니다.");
                islogin = 0;
            }
        }

        private void exit_btn_Click(object sender, EventArgs e)
        {
            this.Close();

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void pictureBox17_Click(object sender, EventArgs e)
        {

        }
    }
}
