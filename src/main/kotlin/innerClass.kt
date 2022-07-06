class innerClass {
    val name="akash"
    val id=1

    /*inner class define using inner keyword
    there is advantage of inner class is that
    it can access the member of outer class even it is
    private
     */
    inner class inner2()

    {
        val description="he is good developer"
        fun detail()
        {
            println("name of student $name and $id")

        }




    }

}