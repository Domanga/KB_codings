using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Movie
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void signup_btn_Click(object sender, EventArgs e)
        {
            Signup signup = new Signup();
            signup.Show();
        }

        private void loginExit_btn_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void login_btn_Click(object sender, EventArgs e)
        {
            string ID = ID_text.Text;
            string PW = PW_text.Text;

            MySqlConnection connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=0506");
            connection.Open();
            string query1 = "SELECT * FROM movie.userinfo WHERE ID = '" + ID + "')";
            try
            {
                MySqlCommand command = new MySqlCommand(query1,connection);
                MySqlDataReader rdr = command.ExecuteReader();
                while (rdr.HasRows)
                {
                    rdr.Read();
                    MessageBox.Show(rdr.GetString(0) + rdr[1].ToString() + rdr[2].ToString());
                    
                    /*
                    if(rdr["PW"].Equals(PW))
                    {
                        MessageBox.Show("로그인 성공!");
                    }
                    else
                    {
                        MessageBox.Show("ID혹은 PW를 확인하세요.");
                    }
                    */

                }

            }
            catch (Exception)
            {

            }
        }
    }
}
