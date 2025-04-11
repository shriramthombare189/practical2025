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
        DataGridView1 = New DataGridView()
        Tid = New DataGridViewTextBoxColumn()
        TName = New DataGridViewTextBoxColumn()
        subject = New DataGridViewTextBoxColumn()
        DataGridView2 = New DataGridView()
        Tids = New DataGridViewTextBoxColumn()
        TNames = New DataGridViewTextBoxColumn()
        subjects = New DataGridViewTextBoxColumn()
        TextBox1 = New TextBox()
        Button1 = New Button()
        Label1 = New Label()
        Button3 = New Button()
        CType(DataGridView1, ComponentModel.ISupportInitialize).BeginInit()
        CType(DataGridView2, ComponentModel.ISupportInitialize).BeginInit()
        SuspendLayout()
        ' 
        ' DataGridView1
        ' 
        DataGridView1.BackgroundColor = SystemColors.ButtonHighlight
        DataGridView1.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize
        DataGridView1.Columns.AddRange(New DataGridViewColumn() {Tid, TName, subject})
        DataGridView1.Location = New Point(360, 207)
        DataGridView1.Name = "DataGridView1"
        DataGridView1.RowHeadersWidth = 51
        DataGridView1.Size = New Size(428, 231)
        DataGridView1.TabIndex = 0
        ' 
        ' Tid
        ' 
        Tid.HeaderText = "Tid"
        Tid.MinimumWidth = 6
        Tid.Name = "Tid"
        Tid.Width = 125
        ' 
        ' TName
        ' 
        TName.HeaderText = "TName"
        TName.MinimumWidth = 6
        TName.Name = "TName"
        TName.Width = 125
        ' 
        ' subject
        ' 
        subject.HeaderText = "subject"
        subject.MinimumWidth = 6
        subject.Name = "subject"
        subject.Width = 125
        ' 
        ' DataGridView2
        ' 
        DataGridView2.BackgroundColor = SystemColors.ButtonHighlight
        DataGridView2.ColumnHeadersHeightSizeMode = DataGridViewColumnHeadersHeightSizeMode.AutoSize
        DataGridView2.Columns.AddRange(New DataGridViewColumn() {Tids, TNames, subjects})
        DataGridView2.Location = New Point(360, 12)
        DataGridView2.Name = "DataGridView2"
        DataGridView2.RowHeadersWidth = 51
        DataGridView2.Size = New Size(428, 140)
        DataGridView2.TabIndex = 1
        ' 
        ' Tids
        ' 
        Tids.HeaderText = "Tid"
        Tids.MinimumWidth = 6
        Tids.Name = "Tids"
        Tids.Width = 125
        ' 
        ' TNames
        ' 
        TNames.HeaderText = "TName"
        TNames.MinimumWidth = 6
        TNames.Name = "TNames"
        TNames.Width = 125
        ' 
        ' subjects
        ' 
        subjects.HeaderText = "subject"
        subjects.MinimumWidth = 6
        subjects.Name = "subjects"
        subjects.Width = 125
        ' 
        ' TextBox1
        ' 
        TextBox1.Location = New Point(0, 35)
        TextBox1.Multiline = True
        TextBox1.Name = "TextBox1"
        TextBox1.Size = New Size(207, 39)
        TextBox1.TabIndex = 2
        ' 
        ' Button1
        ' 
        Button1.Location = New Point(227, 45)
        Button1.Name = "Button1"
        Button1.Size = New Size(114, 29)
        Button1.TabIndex = 3
        Button1.Text = "search"
        Button1.UseVisualStyleBackColor = True
        ' 
        ' Label1
        ' 
        Label1.AutoSize = True
        Label1.Location = New Point(0, 12)
        Label1.Name = "Label1"
        Label1.Size = New Size(192, 20)
        Label1.TabIndex = 4
        Label1.Text = "Enter the Name of Teacher :"
        ' 
        ' Button3
        ' 
        Button3.Location = New Point(360, 172)
        Button3.Name = "Button3"
        Button3.Size = New Size(94, 29)
        Button3.TabIndex = 5
        Button3.Text = "Display All"
        Button3.UseVisualStyleBackColor = True
        ' 
        ' Form1
        ' 
        AutoScaleDimensions = New SizeF(8F, 20F)
        AutoScaleMode = AutoScaleMode.Font
        ClientSize = New Size(800, 450)
        Controls.Add(Button3)
        Controls.Add(Label1)
        Controls.Add(Button1)
        Controls.Add(TextBox1)
        Controls.Add(DataGridView2)
        Controls.Add(DataGridView1)
        Name = "Form1"
        Text = "Form1"
        CType(DataGridView1, ComponentModel.ISupportInitialize).EndInit()
        CType(DataGridView2, ComponentModel.ISupportInitialize).EndInit()
        ResumeLayout(False)
        PerformLayout()
    End Sub

    Friend WithEvents DataGridView1 As DataGridView
    Friend WithEvents DataGridView2 As DataGridView
    Friend WithEvents TextBox1 As TextBox
    Friend WithEvents Button1 As Button
    Friend WithEvents Tid As DataGridViewTextBoxColumn
    Friend WithEvents TName As DataGridViewTextBoxColumn
    Friend WithEvents subject As DataGridViewTextBoxColumn
    Friend WithEvents Label1 As Label
    Friend WithEvents Tids As DataGridViewTextBoxColumn
    Friend WithEvents TNames As DataGridViewTextBoxColumn
    Friend WithEvents subjects As DataGridViewTextBoxColumn
    Friend WithEvents Button2 As Button
    Friend WithEvents Button3 As Button

End Class
