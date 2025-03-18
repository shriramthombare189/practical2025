<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()>
Partial Class Form1
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()>
    Protected Overrides Sub Dispose(disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()>
    Private Sub InitializeComponent()
        Label1 = New Label()
        Label2 = New Label()
        Label3 = New Label()
        Button1 = New Button()
        TextBox1 = New TextBox()
        TextBox2 = New TextBox()
        TextBox3 = New TextBox()
        DataGridView1 = New DataGridView()
        id = New DataGridViewTextBoxColumn()
        name = New DataGridViewTextBoxColumn()
        salary = New DataGridViewTextBoxColumn()
        Label4 = New Label()
        Button2 = New Button()
        CType(DataGridView1, ComponentModel.ISupportInitialize).BeginInit()
        SuspendLayout()
        ' 
        ' Label1
        ' 
        Label1.AutoSize = True
        Label1.Location = New Point(12, 12)
        Label1.Name = "Label1"
        Label1.Size = New Size(168, 20)
        Label1.TabIndex = 0
        Label1.Text = "Enter the Employee ID : "
        ' 
        ' Label2
        ' 
        Label2.AutoSize = True
        Label2.Location = New Point(12, 52)
        Label2.Name = "Label2"
        Label2.Size = New Size(211, 20)
        Label2.TabIndex = 1
        Label2.Text = "Enter the Name of Employee : "
        ' 
        ' Label3
        ' 
        Label3.AutoSize = True
        Label3.Location = New Point(12, 95)
        Label3.Name = "Label3"
        Label3.Size = New Size(193, 20)
        Label3.TabIndex = 2
        Label3.Text = "Enter the Employee Salary : "
        ' 
        ' Button1
        ' 
        Button1.Location = New Point(545, 95)
        Button1.Name = "Button1"
        Button1.Size = New Size(168, 40)
        Button1.TabIndex = 3
        Button1.Text = "Add Employee"
        Button1.UseVisualStyleBackColor = True
        ' 
        ' TextBox1
        ' 
        TextBox1.Location = New Point(246, 9)
        TextBox1.Multiline = True
        TextBox1.Name = "TextBox1"
        TextBox1.Size = New Size(209, 34)
        TextBox1.TabIndex = 4
        ' 
        ' TextBox2
        ' 
        TextBox2.Location = New Point(246, 52)
        TextBox2.Multiline = True
        TextBox2.Name = "TextBox2"
        TextBox2.Size = New Size(209, 34)
        TextBox2.TabIndex = 5
        ' 
        ' TextBox3
        ' 
        TextBox3.Location = New Point(246, 105)
        TextBox3.Multiline = True
        TextBox3.Name = "TextBox3"
        TextBox3.Size = New Size(209, 34)
        TextBox3.TabIndex = 6
        ' 
        ' DataGridView1
        ' 
        DataGridView1.AllowUserToOrderColumns = True
        DataGridView1.BackgroundColor = SystemColors.ButtonHighlight
        DataGridView1.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize
        DataGridView1.Columns.AddRange(New DataGridViewColumn() {id, name, salary})
        DataGridView1.Location = New Point(155, 227)
        DataGridView1.Name = "DataGridView1"
        DataGridView1.RowHeadersWidthSizeMode = DataGridViewRowHeadersWidthSizeMode.AutoSizeToAllHeaders
        DataGridView1.Size = New Size(411, 211)
        DataGridView1.TabIndex = 7
        ' 
        ' id
        ' 
        id.HeaderText = "Employee ID"
        id.MinimumWidth = 6
        id.Name = "id"
        id.Width = 125
        ' 
        ' name
        ' 
        name.HeaderText = "Employee Name"
        name.MinimumWidth = 6
        name.Name = "name"
        name.Width = 125
        ' 
        ' salary
        ' 
        salary.HeaderText = "Employee Salary"
        salary.MinimumWidth = 6
        salary.Name = "salary"
        salary.Width = 125
        ' 
        ' Label4
        ' 
        Label4.AutoSize = True
        Label4.Font = New Font("Segoe UI", 12F, FontStyle.Bold Or FontStyle.Italic, GraphicsUnit.Point, CByte(0))
        Label4.Location = New Point(231, 196)
        Label4.Name = "Label4"
        Label4.Size = New Size(243, 28)
        Label4.TabIndex = 8
        Label4.Text = "Emloyee Lokal Database"
        ' 
        ' Button2
        ' 
        Button2.Location = New Point(545, 12)
        Button2.Name = "Button2"
        Button2.Size = New Size(168, 39)
        Button2.TabIndex = 9
        Button2.Text = "Clear"
        Button2.UseVisualStyleBackColor = True
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(8F, 20F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(733, 429)
        Controls.Add(Button2)
        Controls.Add(Label4)
        Controls.Add(DataGridView1)
        Controls.Add(TextBox3)
        Controls.Add(TextBox2)
        Controls.Add(TextBox1)
        Controls.Add(Button1)
        Controls.Add(Label3)
        Controls.Add(Label2)
        Controls.Add(Label1)
        Name = "Form1"
        Text = "Form1"
        CType(DataGridView1, ComponentModel.ISupportInitialize).EndInit()
        ResumeLayout(False)
        PerformLayout()
    End Sub

    Friend WithEvents Label1 As Label
    Friend WithEvents Label2 As Label
    Friend WithEvents Label3 As Label
    Friend WithEvents Button1 As Button
    Friend WithEvents TextBox1 As TextBox
    Friend WithEvents TextBox2 As TextBox
    Friend WithEvents TextBox3 As TextBox
    Friend WithEvents DataGridView1 As DataGridView
    Friend WithEvents id As DataGridViewTextBoxColumn
    Friend WithEvents name As DataGridViewTextBoxColumn
    Friend WithEvents salary As DataGridViewTextBoxColumn
    Friend WithEvents Label4 As Label
    Friend WithEvents Button2 As Button

End Class
