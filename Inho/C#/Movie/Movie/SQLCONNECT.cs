using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.SqlClient;

namespace Movie
{
    class SQLCONNECT
    {
        public SqlConnection con;

        public void Connection()
        {
            con = new SqlConnection("Server=localhost;Port=3306;Database=movie;Uid=root;Pwd=1111");

        }

    }
}
