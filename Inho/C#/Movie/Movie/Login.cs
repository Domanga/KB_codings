﻿using MySql.Data.MySqlClient;
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
        MySqlConnection connection;
        MySqlCommand cmd;
        MySqlDataReader rdr;
        static int isCon = 0;
        static int islogin1 = 0;
        public class islogin
        {
            private int islog = 0;
            public islogin()
            {

            }
            public void setislogin(int login)
            {
                this.islog = login;
            }
            public int getislogin()
            {
                return this.islog;
            }
        }
        public Login()
        {
            connection = new MySqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=0506");
            connection.Open();
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
            islogin login = new islogin();

            cmd = new MySqlCommand();
            if (isCon == 0)
            {
                cmd.Connection = connection;
                isCon = 1;
            }
            cmd.CommandText = "SELECT iD,PW,Email FROM movie.userinfo WHERE ID = '" + ID_text.Text + "' AND PW = '" + PW_text.Text + "'";
            rdr = cmd.ExecuteReader();

            try
            {
                while (rdr.Read())
                {
                    if (rdr[0].ToString().Equals(ID) && rdr[1].ToString().Equals(PW) && login.getislogin() == 0)
                    {
                        MessageBox.Show("로그인 성공!");
                        islogin1 = 1;
                        this.Close();
                    }
                    else
                    {
                        MessageBox.Show("ID 혹은 PW를 확인하세요.");
                    }
                }
                Form1 main = new Form1(islogin1, ID);
                
            }
            catch (Exception )
            {
                MessageBox.Show("에러");
            }
        }
    }
}