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
    public partial class Ticket : Form
    {
        public static string movie, id;
        public Ticket()
        {
            InitializeComponent();
            Initialization();
        }
        private void Initialization()
        {
            movie_image.Image = new Bitmap("Movie.Properties.image." + movie + ".jpg");
           
        }
        public Ticket(string MOVIE, string ID)
        {
            id = ID;
            movie = MOVIE;
        }
        private void signExit_btn_Click(object sender, EventArgs e)
        {
            this.Close();
        }


    }
}
