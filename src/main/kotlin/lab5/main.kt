package lab5

fun main() {
    val colour1 = Color(255, 255, 255, 0)
    val colour2 = Color(1, 1, 1, 0)
    val shape1 = Circle(colour1, colour1, 1.5)
    val shape2 = Circle(colour1, colour2, 3.0)
    val shape3 = Square(colour2, colour1, 1.0)
    val shape4 = Square(colour2, colour2, 5.0)
    val shape5 = Rectangle(colour1, colour1, 1.0, 3.0)
    val shape6 = Triangle(colour2, colour1, 3.0, 4.0, 5.0)
    val myShapeCollector = ShapeCollector<ColoredShape2d>()
    myShapeCollector.addAll(listOf(shape1, shape2))
    myShapeCollector.insertShape2d(shape3)
    myShapeCollector.insertShape2d(shape4)
    myShapeCollector.insertShape2d(shape5)
    myShapeCollector.insertShape2d(shape6)
    println("Full list of ShapeCollector:")
    println(myShapeCollector)
    println("Sorted ShapeCollector by according shapes area:")
    println(myShapeCollector.getSorted(SortedByShapeArea()))
    println("\nSorted ShapeCollector by descending shapes area:")
    println(myShapeCollector.getSorted(SortedByDescendingShapeArea()))
    println("\nList of colored 2d shapes with minimum area:")
    println(myShapeCollector.minArea())
    println("\nList of colored 2d shapes with maximum area:")
    println(myShapeCollector.maxArea())
    print("\nThe sum of all colored 2d shapes areas is: ")
    println(myShapeCollector.sumAllAreas())
    println("\nList of list of colored 2d shapes sorted by user fill color:")
    println(myShapeCollector.searchByFillColor(colour2))
    println("\nList of colored 2d shapes sorted by user border color:")
    println(myShapeCollector.searchByBorderColor(colour1))
    println("\nReturn the list of ShapeCollector:")
    println(myShapeCollector.getList())
    print("\nReturn the size of ShapeCollector: ")
    println(myShapeCollector.getListSize())
    println("\nMap created by fill colors:")
    println(myShapeCollector.getMapByFillColor())
    println("\nMap created by border colors:")
    println(myShapeCollector.getMapByBorderColor())
    println("\nReturn the list of ShapeCollector shapes with user type:")
    println(myShapeCollector.filterByType("Circle"))
}
