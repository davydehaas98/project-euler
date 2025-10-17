package nl.davydehaas.projecteuler.util;

import java.util.function.Supplier;

public final class SolutionTimer {

    private SolutionTimer() {
    }

    /// @param supplier The method to time as [Supplier].
    public static void timeSolution(Supplier<Object> supplier) {
        long startTime = System.nanoTime();
        Object result = supplier.get();
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000F;

        System.out.print("""
                %s
                ---
                Result:
                %s

                Duration (ms):
                %s
                ---
                """.formatted(supplier.getClass(), result, duration));
    }
}
