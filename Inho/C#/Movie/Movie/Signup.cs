using MySql.Data.MySqlClient;
using System;
using System.Windows.Forms;

namespace Movie
{
    public partial class Signup : Form
    {
        MemberVo memberVo = new MemberVo();
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

            memberVo.Id = userID_text.Text;
            memberVo.Pw = passwd_text.Text;
            memberVo.E_mail = email_text.Text;

            MySqlConnection connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=1111");
            connection.Open();
            string query = "INSERT INTO movie.userinfo VALUES('" + memberVo.Id + "', '" + memberVo.Pw + "' , '" + memberVo.E_mail + "')";
            try
            {
                if (memberVo.Pw.Equals(confirm_text.Text))
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
            catch (Exception)
            {
                MessageBox.Show("아이디가 중복되었습니다.");
            }

        }
    }
}
