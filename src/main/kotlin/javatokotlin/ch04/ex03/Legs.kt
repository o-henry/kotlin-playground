package javatokotlin.ch04.ex03

import javatokotlin.ch04.Leg
import java.time.Duration
import java.util.*

object Legs { // unnecessary namespace
    /**
     * java logic
     */
    @JvmStatic
    fun findLongestLegOver(
        legs: List<Leg>,
        duration: Duration
    ): Optional<Leg> {
        return Optional.ofNullable(longestLegOver(legs, duration))
    }

    /**
     * Extract function && kotlin logic
     * findLongestLegOver === longestLegOver
     */
    fun longestLegOver(
        legs: List<Leg>,
        duration: Duration
    ): Leg? {
        var result: Leg? = null
        for (leg in legs) {
            if (leg.isLongerThan(duration))
                if (result == null ||
                    leg.isLongerThan(result.plannedDuration))
                    result = leg
        }
        return result
    }

    private fun Leg.isLongerThan(duration: Duration) =
        plannedDuration > duration
}
