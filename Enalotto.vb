Module Enalotto

    Sub Main()
        Dim numbers As SortedSet(Of Int16) = New SortedSet(Of Int16)
        Dim rnd As New Random()

        While numbers.Count < 6
            numbers.Add(rnd.Next(1, 91))
        End While

        Dim index As Integer = 0
        For Each number As String In numbers
            If (number < 10) Then
                Console.Write("0")
            End If

            Console.Write(number)

            If (index < 5) Then
                Console.Write(" - ")
            End If

            index += 1
        Next
    End Sub

End Module
