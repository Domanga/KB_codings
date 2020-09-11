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
    public partial class Signup : Form
    {

        public Signup()
        {
            InitializeComponent();
        }

        private void signExit_btn_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void signup_btn_Click(object sender, EventArgs e)
        {
            string id = userID_text.Text;
            string pw = passwd_text.Text;
            string email = email_text.Text;

            MySqlConnection connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=0506");
            connection.Open();
            string query = "INSERT INTO movie.userinfo VALUES('" + id + "', '" + pw + "' , '" + email + "')";
            try
            {
                if (pw.Equals(confirm_text.Text))
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    if (command.ExecuteNonQuery() == 1)
                    {
                        MessageBox.Show("가입되었습니다.");
                        this.Close();
                    }
                    else
                    {
                        MessageBox.Show("비정상");
                    }
                }
                else
                {
                    MessageBox.Show("비밀번호가 일치하지 않습니다.");
                }
            }
            catch (Exception ex)
            {
                MessageBox.Show("아이디가 중복되었습니다.");
            }

        }
    }
}
