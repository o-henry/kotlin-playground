package javatokotlin.ch04.ex01

import javatokotlin.ch04.Leg
import java.time.Duration
import java.util.*

    object Legs {
    /**
     * TODO optional to nullable
     */
    @JvmStatic
    fun findLongestLegOver(
        legs: List<Leg>,
        duration: Duration
    ): Optional<Leg> {
        var result: Leg? = null
        for (leg in legs) {
            if (isLongerThan(leg, duration))
                if (result == null ||
                    isLongerThan(leg, result.plannedDuration)
                )
                    result = leg

        }
        return Optional.ofNullable(result)
    }

    private fun isLongerThan(leg: Leg, duration: Duration): Boolean {
        return leg.plannedDuration.compareTo(duration) > 0
    }
}
