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
}