namespace Loteria_Dam
{
    partial class Form1
    {
        /// <summary>
        /// Variable del diseñador necesaria.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Limpiar los recursos que se estén usando.
        /// </summary>
        /// <param name="disposing">true si los recursos administrados se deben desechar; false en caso contrario.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Código generado por el Diseñador de Windows Forms

        /// <summary>
        /// Método necesario para admitir el Diseñador. No se puede modificar
        /// el contenido de este método con el editor de código.
        /// </summary>
        private void InitializeComponent()
        {
            this.botonApostar = new System.Windows.Forms.Button();
            this.botonSalir = new System.Windows.Forms.Button();
            this.label2 = new System.Windows.Forms.Label();
            this.tipoApuesta = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBoxApuesta = new System.Windows.Forms.GroupBox();
            this.textReintegro = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.checkBox16 = new System.Windows.Forms.CheckBox();
            this.checkBox15 = new System.Windows.Forms.CheckBox();
            this.checkBox14 = new System.Windows.Forms.CheckBox();
            this.checkBox13 = new System.Windows.Forms.CheckBox();
            this.checkBox12 = new System.Windows.Forms.CheckBox();
            this.checkBox11 = new System.Windows.Forms.CheckBox();
            this.checkBox10 = new System.Windows.Forms.CheckBox();
            this.checkBox9 = new System.Windows.Forms.CheckBox();
            this.checkBox8 = new System.Windows.Forms.CheckBox();
            this.checkBox7 = new System.Windows.Forms.CheckBox();
            this.checkBox6 = new System.Windows.Forms.CheckBox();
            this.checkBox5 = new System.Windows.Forms.CheckBox();
            this.checkBox4 = new System.Windows.Forms.CheckBox();
            this.checkBox3 = new System.Windows.Forms.CheckBox();
            this.checkBox2 = new System.Windows.Forms.CheckBox();
            this.checkBox1 = new System.Windows.Forms.CheckBox();
            this.label1 = new System.Windows.Forms.Label();
            this.botonValidar = new System.Windows.Forms.Button();
            this.calendario = new System.Windows.Forms.DateTimePicker();
            this.label4 = new System.Windows.Forms.Label();
            this.radioAutomatico = new System.Windows.Forms.RadioButton();
            this.radioManual = new System.Windows.Forms.RadioButton();
            this.groupBoxResguardo = new System.Windows.Forms.GroupBox();
            this.listBox1 = new System.Windows.Forms.ListBox();
            this.groupBoxApuesta.SuspendLayout();
            this.groupBoxResguardo.SuspendLayout();
            this.SuspendLayout();
            // 
            // botonApostar
            // 
            this.botonApostar.Location = new System.Drawing.Point(18, 170);
            this.botonApostar.Name = "botonApostar";
            this.botonApostar.Size = new System.Drawing.Size(87, 23);
            this.botonApostar.TabIndex = 1;
            this.botonApostar.Text = "Apostar";
            this.botonApostar.UseVisualStyleBackColor = true;
            this.botonApostar.Click += new System.EventHandler(this.button1_Click);
            // 
            // botonSalir
            // 
            this.botonSalir.Location = new System.Drawing.Point(111, 170);
            this.botonSalir.Name = "botonSalir";
            this.botonSalir.Size = new System.Drawing.Size(68, 23);
            this.botonSalir.TabIndex = 2;
            this.botonSalir.Text = "Salir";
            this.botonSalir.UseVisualStyleBackColor = true;
            this.botonSalir.Click += new System.EventHandler(this.button2_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(6, 28);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(49, 13);
            this.label2.TabIndex = 4;
            this.label2.Text = "Apuesta:";
            // 
            // tipoApuesta
            // 
            this.tipoApuesta.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.tipoApuesta.FormattingEnabled = true;
            this.tipoApuesta.Items.AddRange(new object[] {
            "SIMPLE",
            "MÚLTIPLE",
            "EXTREMA"});
            this.tipoApuesta.Location = new System.Drawing.Point(61, 25);
            this.tipoApuesta.Name = "tipoApuesta";
            this.tipoApuesta.Size = new System.Drawing.Size(99, 21);
            this.tipoApuesta.TabIndex = 5;
            this.tipoApuesta.SelectedIndexChanged += new System.EventHandler(this.tipoApuesta_SelectedIndexChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Enabled = false;
            this.label3.Location = new System.Drawing.Point(23, 63);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(31, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "Tipo:";
            // 
            // groupBoxApuesta
            // 
            this.groupBoxApuesta.Controls.Add(this.textReintegro);
            this.groupBoxApuesta.Controls.Add(this.label5);
            this.groupBoxApuesta.Controls.Add(this.checkBox16);
            this.groupBoxApuesta.Controls.Add(this.checkBox15);
            this.groupBoxApuesta.Controls.Add(this.checkBox14);
            this.groupBoxApuesta.Controls.Add(this.checkBox13);
            this.groupBoxApuesta.Controls.Add(this.checkBox12);
            this.groupBoxApuesta.Controls.Add(this.checkBox11);
            this.groupBoxApuesta.Controls.Add(this.checkBox10);
            this.groupBoxApuesta.Controls.Add(this.checkBox9);
            this.groupBoxApuesta.Controls.Add(this.checkBox8);
            this.groupBoxApuesta.Controls.Add(this.checkBox7);
            this.groupBoxApuesta.Controls.Add(this.checkBox6);
            this.groupBoxApuesta.Controls.Add(this.checkBox5);
            this.groupBoxApuesta.Controls.Add(this.checkBox4);
            this.groupBoxApuesta.Controls.Add(this.checkBox3);
            this.groupBoxApuesta.Controls.Add(this.checkBox2);
            this.groupBoxApuesta.Controls.Add(this.checkBox1);
            this.groupBoxApuesta.Controls.Add(this.label1);
            this.groupBoxApuesta.Controls.Add(this.botonValidar);
            this.groupBoxApuesta.Controls.Add(this.calendario);
            this.groupBoxApuesta.Controls.Add(this.label4);
            this.groupBoxApuesta.Controls.Add(this.radioAutomatico);
            this.groupBoxApuesta.Controls.Add(this.radioManual);
            this.groupBoxApuesta.Controls.Add(this.tipoApuesta);
            this.groupBoxApuesta.Controls.Add(this.label2);
            this.groupBoxApuesta.Controls.Add(this.label3);
            this.groupBoxApuesta.Location = new System.Drawing.Point(12, 13);
            this.groupBoxApuesta.Name = "groupBoxApuesta";
            this.groupBoxApuesta.Size = new System.Drawing.Size(373, 233);
            this.groupBoxApuesta.TabIndex = 11;
            this.groupBoxApuesta.TabStop = false;
            this.groupBoxApuesta.Text = "APUESTA DE LOTERIA";
            // 
            // textReintegro
            // 
            this.textReintegro.Location = new System.Drawing.Point(300, 162);
            this.textReintegro.Name = "textReintegro";
            this.textReintegro.Size = new System.Drawing.Size(45, 20);
            this.textReintegro.TabIndex = 34;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(198, 167);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(101, 13);
            this.label5.TabIndex = 33;
            this.label5.Text = "Nº Reintegro [1-10]:";
            // 
            // checkBox16
            // 
            this.checkBox16.AutoSize = true;
            this.checkBox16.Enabled = false;
            this.checkBox16.Location = new System.Drawing.Point(318, 130);
            this.checkBox16.Name = "checkBox16";
            this.checkBox16.Size = new System.Drawing.Size(38, 17);
            this.checkBox16.TabIndex = 32;
            this.checkBox16.Text = "16";
            this.checkBox16.UseVisualStyleBackColor = true;
            // 
            // checkBox15
            // 
            this.checkBox15.AutoSize = true;
            this.checkBox15.Enabled = false;
            this.checkBox15.Location = new System.Drawing.Point(318, 106);
            this.checkBox15.Name = "checkBox15";
            this.checkBox15.Size = new System.Drawing.Size(38, 17);
            this.checkBox15.TabIndex = 31;
            this.checkBox15.Text = "15";
            this.checkBox15.UseVisualStyleBackColor = true;
            // 
            // checkBox14
            // 
            this.checkBox14.AutoSize = true;
            this.checkBox14.Enabled = false;
            this.checkBox14.Location = new System.Drawing.Point(318, 82);
            this.checkBox14.Name = "checkBox14";
            this.checkBox14.Size = new System.Drawing.Size(38, 17);
            this.checkBox14.TabIndex = 30;
            this.checkBox14.Text = "14";
            this.checkBox14.UseVisualStyleBackColor = true;
            // 
            // checkBox13
            // 
            this.checkBox13.AutoSize = true;
            this.checkBox13.Enabled = false;
            this.checkBox13.Location = new System.Drawing.Point(318, 58);
            this.checkBox13.Name = "checkBox13";
            this.checkBox13.Size = new System.Drawing.Size(38, 17);
            this.checkBox13.TabIndex = 29;
            this.checkBox13.Text = "13";
            this.checkBox13.UseVisualStyleBackColor = true;
            // 
            // checkBox12
            // 
            this.checkBox12.AutoSize = true;
            this.checkBox12.Enabled = false;
            this.checkBox12.Location = new System.Drawing.Point(279, 131);
            this.checkBox12.Name = "checkBox12";
            this.checkBox12.Size = new System.Drawing.Size(38, 17);
            this.checkBox12.TabIndex = 28;
            this.checkBox12.Text = "12";
            this.checkBox12.UseVisualStyleBackColor = true;
            // 
            // checkBox11
            // 
            this.checkBox11.AutoSize = true;
            this.checkBox11.Enabled = false;
            this.checkBox11.Location = new System.Drawing.Point(279, 106);
            this.checkBox11.Name = "checkBox11";
            this.checkBox11.Size = new System.Drawing.Size(38, 17);
            this.checkBox11.TabIndex = 27;
            this.checkBox11.Text = "11";
            this.checkBox11.UseVisualStyleBackColor = true;
            // 
            // checkBox10
            // 
            this.checkBox10.AutoSize = true;
            this.checkBox10.Enabled = false;
            this.checkBox10.Location = new System.Drawing.Point(279, 83);
            this.checkBox10.Name = "checkBox10";
            this.checkBox10.Size = new System.Drawing.Size(38, 17);
            this.checkBox10.TabIndex = 26;
            this.checkBox10.Text = "10";
            this.checkBox10.UseVisualStyleBackColor = true;
            // 
            // checkBox9
            // 
            this.checkBox9.AutoSize = true;
            this.checkBox9.Enabled = false;
            this.checkBox9.Location = new System.Drawing.Point(279, 58);
            this.checkBox9.Name = "checkBox9";
            this.checkBox9.Size = new System.Drawing.Size(32, 17);
            this.checkBox9.TabIndex = 25;
            this.checkBox9.Text = "9";
            this.checkBox9.UseVisualStyleBackColor = true;
            // 
            // checkBox8
            // 
            this.checkBox8.AutoSize = true;
            this.checkBox8.Enabled = false;
            this.checkBox8.Location = new System.Drawing.Point(240, 131);
            this.checkBox8.Name = "checkBox8";
            this.checkBox8.Size = new System.Drawing.Size(32, 17);
            this.checkBox8.TabIndex = 24;
            this.checkBox8.Text = "8";
            this.checkBox8.UseVisualStyleBackColor = true;
            // 
            // checkBox7
            // 
            this.checkBox7.AutoSize = true;
            this.checkBox7.Enabled = false;
            this.checkBox7.Location = new System.Drawing.Point(240, 107);
            this.checkBox7.Name = "checkBox7";
            this.checkBox7.Size = new System.Drawing.Size(32, 17);
            this.checkBox7.TabIndex = 23;
            this.checkBox7.Text = "7";
            this.checkBox7.UseVisualStyleBackColor = true;
            // 
            // checkBox6
            // 
            this.checkBox6.AutoSize = true;
            this.checkBox6.Enabled = false;
            this.checkBox6.Location = new System.Drawing.Point(240, 83);
            this.checkBox6.Name = "checkBox6";
            this.checkBox6.Size = new System.Drawing.Size(32, 17);
            this.checkBox6.TabIndex = 22;
            this.checkBox6.Text = "6";
            this.checkBox6.UseVisualStyleBackColor = true;
            // 
            // checkBox5
            // 
            this.checkBox5.AutoSize = true;
            this.checkBox5.Enabled = false;
            this.checkBox5.Location = new System.Drawing.Point(240, 59);
            this.checkBox5.Name = "checkBox5";
            this.checkBox5.Size = new System.Drawing.Size(32, 17);
            this.checkBox5.TabIndex = 21;
            this.checkBox5.Text = "5";
            this.checkBox5.UseVisualStyleBackColor = true;
            // 
            // checkBox4
            // 
            this.checkBox4.AutoSize = true;
            this.checkBox4.Enabled = false;
            this.checkBox4.Location = new System.Drawing.Point(201, 130);
            this.checkBox4.Name = "checkBox4";
            this.checkBox4.Size = new System.Drawing.Size(32, 17);
            this.checkBox4.TabIndex = 20;
            this.checkBox4.Text = "4";
            this.checkBox4.UseVisualStyleBackColor = true;
            // 
            // checkBox3
            // 
            this.checkBox3.AutoSize = true;
            this.checkBox3.Enabled = false;
            this.checkBox3.Location = new System.Drawing.Point(201, 106);
            this.checkBox3.Name = "checkBox3";
            this.checkBox3.Size = new System.Drawing.Size(32, 17);
            this.checkBox3.TabIndex = 19;
            this.checkBox3.Text = "3";
            this.checkBox3.UseVisualStyleBackColor = true;
            // 
            // checkBox2
            // 
            this.checkBox2.AutoSize = true;
            this.checkBox2.Enabled = false;
            this.checkBox2.Location = new System.Drawing.Point(201, 82);
            this.checkBox2.Name = "checkBox2";
            this.checkBox2.Size = new System.Drawing.Size(32, 17);
            this.checkBox2.TabIndex = 18;
            this.checkBox2.Text = "2";
            this.checkBox2.UseVisualStyleBackColor = true;
            // 
            // checkBox1
            // 
            this.checkBox1.AutoSize = true;
            this.checkBox1.Enabled = false;
            this.checkBox1.Location = new System.Drawing.Point(201, 58);
            this.checkBox1.Name = "checkBox1";
            this.checkBox1.Size = new System.Drawing.Size(32, 17);
            this.checkBox1.TabIndex = 17;
            this.checkBox1.Text = "1";
            this.checkBox1.UseVisualStyleBackColor = true;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(198, 25);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(147, 13);
            this.label1.TabIndex = 16;
            this.label1.Text = "Elija sus numeros de apuesta:";
            // 
            // botonValidar
            // 
            this.botonValidar.Enabled = false;
            this.botonValidar.Location = new System.Drawing.Point(16, 162);
            this.botonValidar.Name = "botonValidar";
            this.botonValidar.Size = new System.Drawing.Size(144, 23);
            this.botonValidar.TabIndex = 15;
            this.botonValidar.Text = "Validar apuesta >>";
            this.botonValidar.UseVisualStyleBackColor = true;
            this.botonValidar.Click += new System.EventHandler(this.button3_Click);
            // 
            // calendario
            // 
            this.calendario.Enabled = false;
            this.calendario.Format = System.Windows.Forms.DateTimePickerFormat.Short;
            this.calendario.Location = new System.Drawing.Point(61, 122);
            this.calendario.Name = "calendario";
            this.calendario.Size = new System.Drawing.Size(99, 20);
            this.calendario.TabIndex = 14;
            this.calendario.ValueChanged += new System.EventHandler(this.dateTimePicker1_ValueChanged);
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Enabled = false;
            this.label4.Location = new System.Drawing.Point(13, 122);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(41, 13);
            this.label4.TabIndex = 13;
            this.label4.Text = "Sorteo:";
            // 
            // radioAutomatico
            // 
            this.radioAutomatico.AutoSize = true;
            this.radioAutomatico.Enabled = false;
            this.radioAutomatico.Location = new System.Drawing.Point(61, 86);
            this.radioAutomatico.Name = "radioAutomatico";
            this.radioAutomatico.Size = new System.Drawing.Size(78, 17);
            this.radioAutomatico.TabIndex = 12;
            this.radioAutomatico.Text = "Automático";
            this.radioAutomatico.UseVisualStyleBackColor = true;
            this.radioAutomatico.CheckedChanged += new System.EventHandler(this.radioAutomatico_CheckedChanged);
            // 
            // radioManual
            // 
            this.radioManual.AutoSize = true;
            this.radioManual.Checked = true;
            this.radioManual.Enabled = false;
            this.radioManual.Location = new System.Drawing.Point(61, 63);
            this.radioManual.Name = "radioManual";
            this.radioManual.Size = new System.Drawing.Size(60, 17);
            this.radioManual.TabIndex = 11;
            this.radioManual.TabStop = true;
            this.radioManual.Text = "Manual";
            this.radioManual.UseVisualStyleBackColor = true;
            this.radioManual.CheckedChanged += new System.EventHandler(this.radioManual_CheckedChanged);
            // 
            // groupBoxResguardo
            // 
            this.groupBoxResguardo.Controls.Add(this.listBox1);
            this.groupBoxResguardo.Controls.Add(this.botonSalir);
            this.groupBoxResguardo.Controls.Add(this.botonApostar);
            this.groupBoxResguardo.Enabled = false;
            this.groupBoxResguardo.Location = new System.Drawing.Point(391, 13);
            this.groupBoxResguardo.Name = "groupBoxResguardo";
            this.groupBoxResguardo.Size = new System.Drawing.Size(197, 233);
            this.groupBoxResguardo.TabIndex = 12;
            this.groupBoxResguardo.TabStop = false;
            this.groupBoxResguardo.Text = "RESGUARDO";
            // 
            // listBox1
            // 
            this.listBox1.FormattingEnabled = true;
            this.listBox1.Location = new System.Drawing.Point(18, 20);
            this.listBox1.Name = "listBox1";
            this.listBox1.Size = new System.Drawing.Size(161, 147);
            this.listBox1.TabIndex = 3;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(598, 226);
            this.Controls.Add(this.groupBoxResguardo);
            this.Controls.Add(this.groupBoxApuesta);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedToolWindow;
            this.Name = "Form1";
            this.Text = "Loterias DAM";
            this.groupBoxApuesta.ResumeLayout(false);
            this.groupBoxApuesta.PerformLayout();
            this.groupBoxResguardo.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion
        private System.Windows.Forms.Button botonApostar;
        private System.Windows.Forms.Button botonSalir;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox tipoApuesta;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.GroupBox groupBoxApuesta;
        private System.Windows.Forms.DateTimePicker calendario;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.RadioButton radioAutomatico;
        private System.Windows.Forms.RadioButton radioManual;
        private System.Windows.Forms.Button botonValidar;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.GroupBox groupBoxResguardo;
        private System.Windows.Forms.TextBox textReintegro;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.CheckBox checkBox16;
        private System.Windows.Forms.CheckBox checkBox15;
        private System.Windows.Forms.CheckBox checkBox14;
        private System.Windows.Forms.CheckBox checkBox13;
        private System.Windows.Forms.CheckBox checkBox12;
        private System.Windows.Forms.CheckBox checkBox11;
        private System.Windows.Forms.CheckBox checkBox10;
        private System.Windows.Forms.CheckBox checkBox9;
        private System.Windows.Forms.CheckBox checkBox8;
        private System.Windows.Forms.CheckBox checkBox7;
        private System.Windows.Forms.CheckBox checkBox6;
        private System.Windows.Forms.CheckBox checkBox5;
        private System.Windows.Forms.CheckBox checkBox4;
        private System.Windows.Forms.CheckBox checkBox3;
        private System.Windows.Forms.CheckBox checkBox2;
        private System.Windows.Forms.CheckBox checkBox1;
        private System.Windows.Forms.ListBox listBox1;
    }
}

