import java.text.DecimalFormat

fun main(args: Array<String>) {
    // Formatting Numbers assignment, due 07-Feb-2022

    var Entry_Val: Float = 1.1F
    var Total_Cost: Float = 0.0F
    val tax = .025
    val tip = .175
    val Dollar = DecimalFormat("$###,###,###.00")

    println("Enter cost of items.  Program will assume a 2.5% tax (joke!!) and will calculate a 17.5% tip.")
    println("Enter 0 when done with items to do calculation")

    while (Entry_Val.toInt() != 0) {
        // Collect cost of items (until user enters 0) and calculate total cost
        print("  ")
        Entry_Val = readLine()!!.toFloat()
        Total_Cost = Total_Cost + Entry_Val
    }

    println("Total Cost = " +Dollar.format(Total_Cost))
    println("Total Cost with a 2.5% Tax = " +Dollar.format(Total_Cost * (1+tax)))
    println("Recommended Tip (17.5%) on purchases = " +Dollar.format(Total_Cost * (1+tax) * tip))

    println("Program arguments: ${args.joinToString()}")
}