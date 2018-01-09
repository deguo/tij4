package ch19enumerated;

/**
 * Switching one enum on another.
 */
public interface D26_Competitor<T extends D26_Competitor<T>> {
	D25_Outcome compete(T competitor);
}