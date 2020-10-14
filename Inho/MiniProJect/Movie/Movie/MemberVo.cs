using System;

namespace Movie
{
    public class MemberVo
    {
        private String id;
        private String pw;
        private String e_mail;

        public string Id { get => id; set => id = value; }
        public string Pw { get => pw; set => pw = value; }
        public string E_mail { get => e_mail; set => e_mail = value; }
    }
}
