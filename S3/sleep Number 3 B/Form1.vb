Imports System.Windows.Forms.VisualStyles.VisualStyleElement

Public Class Form1
    Dim n As String

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles Button1.Click
        n = TextBox1.Text
        If (n = "seeta") Then
            Me.DataGridView2.Rows.Add("1", "seeta", "Math")
        ElseIf (n = "Nita") Then
            Me.DataGridView2.Rows.Add("2", "Nita", "Java")
        ElseIf (n = "Nita") Then
            Me.DataGridView2.Rows.Add("3", "gita", "C")
        ElseIf (n = "Nita") Then
            Me.DataGridView2.Rows.Add("4", "rita", ".net")
        ElseIf (n = "Nita") Then
            Me.DataGridView2.Rows.Add("5", "lita", "python")
        Else
            Me.DataGridView2.Rows.Add("reocrd not faund..........")
        End If
    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        Me.DataGridView1.Rows.Add("1", "seeta", "Math")
        Me.DataGridView1.Rows.Add("2", "Nita", "Java")
        Me.DataGridView1.Rows.Add("3", "gita", "C")
        Me.DataGridView1.Rows.Add("4", "rita", ".net")
        Me.DataGridView1.Rows.Add("5", "lita", "python")
    End Sub
End Class
