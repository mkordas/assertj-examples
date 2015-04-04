package org.assertj.examples.data.bug26;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.internal.Iterables;

/**
 * Abstract base class for {@link WithGenericListType} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractWithGenericListTypeAssert<S extends AbstractWithGenericListTypeAssert<S, A>, A extends WithGenericListType> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractWithGenericListTypeAssert}</code> to make assertions on actual WithGenericListType.
   * @param actual the WithGenericListType we want to make assertions on.
   */
  protected AbstractWithGenericListTypeAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual WithGenericListType's movies contains the given org.assertj.examples.data.movie.Movie elements.
   * @param movies the given elements that should be contained in actual WithGenericListType's movies.
   * @return this assertion object.
   * @throws AssertionError if the actual WithGenericListType's movies does not contain all given org.assertj.examples.data.movie.Movie elements.
   */
  public S hasMovies(org.assertj.examples.data.movie.Movie... movies) {
    // check that actual WithGenericListType we want to make assertions on is not null.
    isNotNull();

    // check that given org.assertj.examples.data.movie.Movie varargs is not null.
    if (movies == null) failWithMessage("Expecting movies parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.movies, movies);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WithGenericListType's movies contains <b>only<b> the given org.assertj.examples.data.movie.Movie elements and nothing else in whatever order.
   * @param movies the given elements that should be contained in actual WithGenericListType's movies.
   * @return this assertion object.
   * @throws AssertionError if the actual WithGenericListType's movies does not contain all given org.assertj.examples.data.movie.Movie elements.
   */
  public S hasOnlyMovies(org.assertj.examples.data.movie.Movie... movies) {
    // check that actual WithGenericListType we want to make assertions on is not null.
    isNotNull();

    // check that given org.assertj.examples.data.movie.Movie varargs is not null.
    if (movies == null) failWithMessage("Expecting movies parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.movies, movies);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WithGenericListType's movies does not contain the given org.assertj.examples.data.movie.Movie elements.
   *
   * @param movies the given elements that should not be in actual WithGenericListType's movies.
   * @return this assertion object.
   * @throws AssertionError if the actual WithGenericListType's movies does not contain all given org.assertj.examples.data.movie.Movie elements.
   */
  public S doesNotHaveMovies(org.assertj.examples.data.movie.Movie... movies) {
    // check that actual WithGenericListType we want to make assertions on is not null.
    isNotNull();

    // check that given org.assertj.examples.data.movie.Movie varargs is not null.
    if (movies == null) failWithMessage("Expecting movies parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.movies, movies);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual WithGenericListType has no movies.
   * @return this assertion object.
   * @throws AssertionError if the actual WithGenericListType's movies is not empty.
   */
  public S hasNoMovies() {
    // check that actual WithGenericListType we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have movies but had :\n  <%s>";
    
    // check
    if (actual.movies.iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.movies);
    }
    
    // return the current assertion for method chaining
    return myself;
  }
  

}
