using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp1Test
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            mybutton.Text = "rewrrwe";

            for (int i = 0; i < 5; i++)
            {
                Button button = new Button();
                button.Location = new Point(200, i*40 + 50);
                button.Text = i+1 + "번째 버튼";
                Controls.Add(button);

            }
        }
    }
}
