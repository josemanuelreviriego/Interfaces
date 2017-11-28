using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Loteria_Dam
{
    
    public partial class Form1 : Form
    {
        
        public Form1()
        {
            InitializeComponent();
            tipoApuesta.SelectedIndex = -1;
 
        }

        


        private void dateTimePicker1_ValueChanged(object sender, EventArgs e)
        {
            if (calendario.Value < DateTime.Today)
            {
                string mensaje = "No se puede participar en un sorteo anterior";
                string titulo = "Error en datos";
                MessageBoxButtons opciones = MessageBoxButtons.OK;
                DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Error);
                calendario.Text = "";


            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            string mensaje = "¿Realmente desea salir?";
            string titulo = "Salir";
            MessageBoxButtons opciones = MessageBoxButtons.YesNo;
            DialogResult result = MessageBox.Show(mensaje, titulo, opciones, MessageBoxIcon.Question);

            if (result == System.Windows.Forms.DialogResult.Yes)
            {
                this.Close();
            }

           
        }

        private void tipoApuesta_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (tipoApuesta.SelectedIndex == 0)
            {
                CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };
                for (int i = 0; i<arraycheck.Length; i++)
                {
                    arraycheck[i].Enabled = true;
                }

                radioAutomatico.Enabled = true;
                radioManual.Enabled = true;
                botonValidar.Enabled = true;
                calendario.Enabled = true;


            }
            else if(tipoApuesta.SelectedIndex == 1)
            {

                CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };
                for (int i = 0; i < arraycheck.Length; i++)
                {
                    arraycheck[i].Enabled = true;
                }
                radioAutomatico.Enabled = true;
                radioManual.Enabled = true;
                botonValidar.Enabled = true;
                calendario.Enabled = true;


            }
            else if(tipoApuesta.SelectedIndex == 2)
            {
                CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };
                for (int i = 0; i < arraycheck.Length; i++)
                {
                    arraycheck[i].Enabled = true;
                }
                radioAutomatico.Enabled = true;
                radioManual.Enabled = true;
                botonValidar.Enabled = true;
                calendario.Enabled = true;
                

            }
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (tipoApuesta.SelectedIndex.Equals(0))
            {
                imprime(4);
            }else if (tipoApuesta.SelectedIndex.Equals(1)){
                imprime(6);
            }else{
                imprime(8);
            }

            groupBoxResguardo.Enabled = true;
            groupBoxApuesta.Enabled = false;
        }

        private void radioManual_CheckedChanged(object sender, EventArgs e)
        {
            Random r = new Random();
            textReintegro.Text = r.Next(1, 11).ToString();
            CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };
            for (int i = 0; i < arraycheck.Length; i++)
            {
                arraycheck[i].Enabled = true;
                arraycheck[i].Checked = false;
            }

            if (tipoApuesta.SelectedIndex == 0)
            {
                int maximo = 0;
                do
                {
                    if (checkBox1.Checked == true)
                        maximo++;
                    if (checkBox2.Checked == true)
                        maximo++;
                    if (checkBox3.Checked == true)
                        maximo++;
                    if (checkBox4.Checked == true)
                        maximo++;
                    if (checkBox5.Checked == true)
                        maximo++;
                    if (checkBox6.Checked == true)
                        maximo++;
                    if (checkBox7.Checked == true)
                        maximo++;
                    if (checkBox8.Checked == true)
                        maximo++;
                    if (checkBox9.Checked == true)
                        maximo++;
                    if (checkBox10.Checked == true)
                        maximo++;
                    if (checkBox11.Checked == true)
                        maximo++;
                    if (checkBox12.Checked == true)
                        maximo++;
                    if (checkBox13.Checked == true)
                        maximo++;
                    if (checkBox14.Checked == true)
                        maximo++;
                    if (checkBox15.Checked == true)
                        maximo++;
                    if (checkBox16.Checked == true)
                        maximo++;
                    if (maximo == 4)
                    {
                        for (int i = 0; i < arraycheck.Length; i++)
                            arraycheck[i].Enabled = false;
                    }
                } while (maximo == 4);
                
                    
            }

        }

        private void imprime(int maximo)
        {
            CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };

            int j = 1;

            for (int i = 0; i < arraycheck.Length; i++)
                if (arraycheck[i].Checked)
                    listBox1.Items.AddRange(new object[] { "Numero " + (j++).ToString() + "  ->  " + (i + 1).ToString() });

            listBox1.Items.AddRange(new object[] { "Reintegro  ==>  " + textReintegro.Text });
        }

        private void radioAutomatico_CheckedChanged(object sender, EventArgs e)
        {
            Random r = new Random();
            textReintegro.Text = r.Next(1, 11).ToString();
            CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };
            if (tipoApuesta.SelectedIndex == 0)
            {
                Random random = new Random();
                for (int i = 0; i < 4; i++)
                {
                    arraycheck[random.Next(1, 16)].Checked = true;
                    for (int a = 0; a < arraycheck.Length; a++)
                        arraycheck[a].Enabled = false;
                    
                }
            }
            else if (tipoApuesta.SelectedIndex == 1)
            {
                Random random = new Random();
                for (int i = 0; i < 6; i++)
                {
                    arraycheck[random.Next(1, 16)].Checked = true;
                    for (int a = 0; a < arraycheck.Length; a++)
                        arraycheck[a].Enabled = false;
                }
            }
            else if (tipoApuesta.SelectedIndex == 2)
            {
                Random random = new Random();
                for (int i = 0; i < 8; i++)
                {
                    arraycheck[random.Next(1, 16)].Checked = true;
                    for (int a = 0; a < arraycheck.Length; a++)
                        arraycheck[a].Enabled = false;
                }

            }
        }
        

        private void button1_Click(object sender, EventArgs e)
        {
            CheckBox[] arraycheck = new CheckBox[] {
               checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7,checkBox8,checkBox9,checkBox10,
               checkBox11,checkBox12,checkBox13,checkBox14,checkBox15,checkBox16
            };
            groupBoxResguardo.Enabled = false;
            groupBoxApuesta.Enabled = true;
            for(int i = 0; i < arraycheck.Length; i++)
            {
                arraycheck[i].Checked = false;
                arraycheck[i].Enabled = true;
            }
            tipoApuesta.SelectedIndex = -1;
            textReintegro.Text = "";
        }
    }
}

