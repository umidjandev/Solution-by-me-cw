fun main() {

    class SmallestIntegerFinder {
        fun findSmallestInt(nums: List<Int>): Int {
           return nums.minOrNull()!!
        }
        /**
        fun findSmallestInt(nums: List<Int>) = nums.minOf { it }

        fun findSmallestInt(nums: List<Int>): Int {
        return nums.sorted().get(0)
        }

        fun findSmallestInt(nums: List<Int>): Int {
        return nums.sorted().first()
        }
         */
    }
    fun repeatStr(r: Int, str: String) : String{
      return str.repeat(r)
    }

    fun abbrevName(name:String): String {
        var array = name.uppercase().split(" ")
        return array[0].get(0)+ "." + array[1].get(0)
    }
    fun litres(time: Double): Int {
        return time.toInt()/2
    }

}