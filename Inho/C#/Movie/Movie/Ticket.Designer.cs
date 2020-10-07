namespace Movie
{
    partial class Ticket
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.movie_image = new System.Windows.Forms.PictureBox();
            this.movie_date = new System.Windows.Forms.DateTimePicker();
            this.movie_title = new System.Windows.Forms.Label();
            this.signExit_btn = new System.Windows.Forms.Button();
            this.AM_time = new System.Windows.Forms.CheckBox();
            this.PM_time = new System.Windows.Forms.CheckBox();
            this.ticket_btn = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.movie_image)).BeginInit();
            this.SuspendLayout();
            // 
            // movie_image
            // 
            this.movie_image.Location = new System.Drawing.Point(17, 21);
            this.movie_image.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.movie_image.Name = "movie_image";
            this.movie_image.Size = new System.Drawing.Size(200, 260);
            this.movie_image.TabIndex = 0;
            this.movie_image.TabStop = false;
            // 
            // movie_date
            // 
            this.movie_date.Location = new System.Drawing.Point(245, 21);
            this.movie_date.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.movie_date.Name = "movie_date";
            this.movie_date.Size = new System.Drawing.Size(284, 27);
            this.movie_date.TabIndex = 1;
            this.movie_date.ValueChanged += new System.EventHandler(this.movie_date_ValueChanged);
            // 
            // movie_title
            // 
            this.movie_title.AutoSize = true;
            this.movie_title.Location = new System.Drawing.Point(83, 286);
            this.movie_title.Margin = new System.Windows.Forms.Padding(4, 0, 4, 0);
            this.movie_title.Name = "movie_title";
            this.movie_title.Size = new System.Drawing.Size(57, 21);
            this.movie_title.TabIndex = 2;
            this.movie_title.Text = "label1";
            // 
            // signExit_btn
            // 
            this.signExit_btn.BackColor = System.Drawing.Color.White;
            this.signExit_btn.FlatAppearance.BorderSize = 0;
            this.signExit_btn.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.signExit_btn.Font = new System.Drawing.Font("Century Gothic", 14.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.signExit_btn.ForeColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.signExit_btn.Location = new System.Drawing.Point(559, 12);
            this.signExit_btn.Name = "signExit_btn";
            this.signExit_btn.Size = new System.Drawing.Size(41, 33);
            this.signExit_btn.TabIndex = 15;
            this.signExit_btn.Text = "X";
            this.signExit_btn.UseVisualStyleBackColor = false;
            this.signExit_btn.Click += new System.EventHandler(this.signExit_btn_Click);
            // 
            // AM_time
            // 
            this.AM_time.AutoSize = true;
            this.AM_time.Location = new System.Drawing.Point(245, 105);
            this.AM_time.Name = "AM_time";
            this.AM_time.Size = new System.Drawing.Size(99, 25);
            this.AM_time.TabIndex = 16;
            this.AM_time.Text = "오전 10시";
            this.AM_time.UseVisualStyleBackColor = true;
            this.AM_time.CheckedChanged += new System.EventHandler(this.time_CheckedChanged);
            // 
            // PM_time
            // 
            this.PM_time.AutoSize = true;
            this.PM_time.Location = new System.Drawing.Point(439, 105);
            this.PM_time.Name = "PM_time";
            this.PM_time.Size = new System.Drawing.Size(90, 25);
            this.PM_time.TabIndex = 17;
            this.PM_time.Text = "오후 4시";
            this.PM_time.UseVisualStyleBackColor = true;
            this.PM_time.CheckedChanged += new System.EventHandler(this.time_CheckedChanged);
            // 
            // ticket_btn
            // 
            this.ticket_btn.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(192)))), ((int)(((byte)(192)))), ((int)(((byte)(255)))));
            this.ticket_btn.FlatAppearance.BorderSize = 0;
            this.ticket_btn.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.ticket_btn.Location = new System.Drawing.Point(296, 243);
            this.ticket_btn.Name = "ticket_btn";
            this.ticket_btn.Size = new System.Drawing.Size(190, 38);
            this.ticket_btn.TabIndex = 18;
            this.ticket_btn.Text = "예매하기";
            this.ticket_btn.UseVisualStyleBackColor = false;
            this.ticket_btn.Click += new System.EventHandler(this.ticket_btn_Click);
            // 
            // Ticket
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(10F, 21F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(612, 322);
            this.Controls.Add(this.ticket_btn);
            this.Controls.Add(this.PM_time);
            this.Controls.Add(this.AM_time);
            this.Controls.Add(this.signExit_btn);
            this.Controls.Add(this.movie_title);
            this.Controls.Add(this.movie_date);
            this.Controls.Add(this.movie_image);
            this.Font = new System.Drawing.Font("Century Gothic", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Margin = new System.Windows.Forms.Padding(4, 5, 4, 5);
            this.Name = "Ticket";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form2";
            ((System.ComponentModel.ISupportInitialize)(this.movie_image)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox movie_image;
        private System.Windows.Forms.DateTimePicker movie_date;
        private System.Windows.Forms.Label movie_title;
        private System.Windows.Forms.Button signExit_btn;
        private System.Windows.Forms.CheckBox AM_time;
        private System.Windows.Forms.CheckBox PM_time;
        private System.Windows.Forms.Button ticket_btn;
    }
}