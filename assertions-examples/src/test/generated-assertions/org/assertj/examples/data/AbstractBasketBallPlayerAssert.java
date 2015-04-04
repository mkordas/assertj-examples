package org.assertj.examples.data;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * Abstract base class for {@link BasketBallPlayer} specific assertions - Generated by CustomAssertionGenerator.
 */
public abstract class AbstractBasketBallPlayerAssert<S extends AbstractBasketBallPlayerAssert<S, A>, A extends BasketBallPlayer> extends AbstractAssert<S, A> {

  /**
   * Creates a new <code>{@link AbstractBasketBallPlayerAssert}</code> to make assertions on actual BasketBallPlayer.
   * @param actual the BasketBallPlayer we want to make assertions on.
   */
  protected AbstractBasketBallPlayerAssert(A actual, Class<S> selfType) {
    super(actual, selfType);
  }

  /**
   * Verifies that the actual BasketBallPlayer's assistsPerGame is equal to the given one.
   * @param assistsPerGame the given assistsPerGame to compare the actual BasketBallPlayer's assistsPerGame to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's assistsPerGame is not equal to the given one.
   */
  public S hasAssistsPerGame(int assistsPerGame) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting assistsPerGame of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualAssistsPerGame = actual.getAssistsPerGame();
    if (actualAssistsPerGame != assistsPerGame) {
      failWithMessage(assertjErrorMessage, actual, assistsPerGame, actualAssistsPerGame);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's name is equal to the given one.
   * @param name the given name to compare the actual BasketBallPlayer's name to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's name is not equal to the given one.
   * @throws org.assertj.examples.exception.NameException if actual.getName() throws one.
   */
  public S hasName(Name name) throws org.assertj.examples.exception.NameException {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting name of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    Name actualName = actual.getName();
    if (!Objects.areEqual(actualName, name)) {
      failWithMessage(assertjErrorMessage, actual, name, actualName);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's points contains the given int[] elements.
   * @param points the given elements that should be contained in actual BasketBallPlayer's points.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's points does not contain all given int[] elements.
   */
  public S hasPoints(int[]... points) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check that given int[] varargs is not null.
    if (points == null) failWithMessage("Expecting points parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getPoints(), points);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's points contains <b>only<b> the given int[] elements and nothing else in whatever order.
   * @param points the given elements that should be contained in actual BasketBallPlayer's points.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's points does not contain all given int[] elements.
   */
  public S hasOnlyPoints(int[]... points) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check that given int[] varargs is not null.
    if (points == null) failWithMessage("Expecting points parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getPoints(), points);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's points does not contain the given int[] elements.
   *
   * @param points the given elements that should not be in actual BasketBallPlayer's points.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's points does not contain all given int[] elements.
   */
  public S doesNotHavePoints(int[]... points) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check that given int[] varargs is not null.
    if (points == null) failWithMessage("Expecting points parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getPoints(), points);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer has no points.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's points is not empty.
   */
  public S hasNoPoints() {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have points but had :\n  <%s>";
    
    // check
    if (actual.getPoints().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getPoints());
    }
    
    // return the current assertion for method chaining
    return myself;
  }
  

  /**
   * Verifies that the actual BasketBallPlayer's pointsPerGame is equal to the given one.
   * @param pointsPerGame the given pointsPerGame to compare the actual BasketBallPlayer's pointsPerGame to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's pointsPerGame is not equal to the given one.
   */
  public S hasPointsPerGame(int pointsPerGame) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting pointsPerGame of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualPointsPerGame = actual.getPointsPerGame();
    if (actualPointsPerGame != pointsPerGame) {
      failWithMessage(assertjErrorMessage, actual, pointsPerGame, actualPointsPerGame);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's reboundsPerGame is equal to the given one.
   * @param reboundsPerGame the given reboundsPerGame to compare the actual BasketBallPlayer's reboundsPerGame to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's reboundsPerGame is not equal to the given one.
   */
  public S hasReboundsPerGame(int reboundsPerGame) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting reboundsPerGame of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    int actualReboundsPerGame = actual.getReboundsPerGame();
    if (actualReboundsPerGame != reboundsPerGame) {
      failWithMessage(assertjErrorMessage, actual, reboundsPerGame, actualReboundsPerGame);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's team is equal to the given one.
   * @param team the given team to compare the actual BasketBallPlayer's team to.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's team is not equal to the given one.
   */
  public S hasTeam(String team) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting team of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // null safe check
    String actualTeam = actual.getTeam();
    if (!Objects.areEqual(actualTeam, team)) {
      failWithMessage(assertjErrorMessage, actual, team, actualTeam);
    }

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's teamMates contains the given BasketBallPlayer elements.
   * @param teamMates the given elements that should be contained in actual BasketBallPlayer's teamMates.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's teamMates does not contain all given BasketBallPlayer elements.
   */
  public S hasTeamMates(BasketBallPlayer... teamMates) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check that given BasketBallPlayer varargs is not null.
    if (teamMates == null) failWithMessage("Expecting teamMates parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getTeamMates(), teamMates);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's teamMates contains <b>only<b> the given BasketBallPlayer elements and nothing else in whatever order.
   * @param teamMates the given elements that should be contained in actual BasketBallPlayer's teamMates.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's teamMates does not contain all given BasketBallPlayer elements.
   */
  public S hasOnlyTeamMates(BasketBallPlayer... teamMates) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check that given BasketBallPlayer varargs is not null.
    if (teamMates == null) failWithMessage("Expecting teamMates parameter not to be null.");
    
    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getTeamMates(), teamMates);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's teamMates does not contain the given BasketBallPlayer elements.
   *
   * @param teamMates the given elements that should not be in actual BasketBallPlayer's teamMates.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's teamMates does not contain all given BasketBallPlayer elements.
   */
  public S doesNotHaveTeamMates(BasketBallPlayer... teamMates) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check that given BasketBallPlayer varargs is not null.
    if (teamMates == null) failWithMessage("Expecting teamMates parameter not to be null.");
    
    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getTeamMates(), teamMates);

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer has no teamMates.
   * @return this assertion object.
   * @throws AssertionError if the actual BasketBallPlayer's teamMates is not empty.
   */
  public S hasNoTeamMates() {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have teamMates but had :\n  <%s>";
    
    // check
    if (actual.getTeamMates().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getTeamMates());
    }
    
    // return the current assertion for method chaining
    return myself;
  }
  

  /**
   * Verifies that the actual BasketBallPlayer's weight is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param weight the value to compare the actual BasketBallPlayer's weight to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's weight is not close enough to the given value.
   */
  public S hasWeight(float weight, float offset) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    float actualWeight = actual.getWeight();
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting weight:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualWeight, weight, offset, Math.abs(weight - actualWeight));
    
    // check
    Assertions.assertThat(actualWeight).overridingErrorMessage(assertjErrorMessage).isCloseTo(weight, Assertions.within(offset));

    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer is rookie.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer is not rookie.
   */
  public S isRookie() {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check
    if (!actual.isRookie()) {
      failWithMessage("\nExpecting that actual BasketBallPlayer is rookie but is not.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer is not rookie.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer is rookie.
   */
  public S isNotRookie() {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    // check
    if (actual.isRookie()) {
      failWithMessage("\nExpecting that actual BasketBallPlayer is not rookie but is.");
    }
    
    // return the current assertion for method chaining
    return myself;
  }

  /**
   * Verifies that the actual BasketBallPlayer's size is close to the given value by less than the given offset.
   * <p>
   * If difference is equal to the offset value, assertion is considered successful.
   * @param size the value to compare the actual BasketBallPlayer's size to.
   * @param offset the given offset.
   * @return this assertion object.
   * @throws AssertionError - if the actual BasketBallPlayer's size is not close enough to the given value.
   */
  public S hasSize(double size, double offset) {
    // check that actual BasketBallPlayer we want to make assertions on is not null.
    isNotNull();

    double actualSize = actual.size;
    
    // overrides the default error message with a more explicit one
    String assertjErrorMessage = String.format("\nExpecting size:\n  <%s>\nto be close to:\n  <%s>\nby less than <%s> but difference was <%s>",
                                               actualSize, size, offset, Math.abs(size - actualSize));
    
    // check
    Assertions.assertThat(actualSize).overridingErrorMessage(assertjErrorMessage).isCloseTo(size, Assertions.within(offset));

    // return the current assertion for method chaining
    return myself;
  }

}
