/**
 * A Thread safe Singleton implementation using Initialization-on-demand holder idiom :
 * https://en.wikipedia.org/wiki/Initialization-on-demand_holder_idiom
 */
public final class ThreadSafeSingleton {
  // Add any object as a private final field here

  private ThreadSafeSingleton() {}
  private static class LazyHolder {
    private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
  }

  public static ThreadSafeSingleton getInstance() {
    return LazyHolder.INSTANCE;
  }
}
