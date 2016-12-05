package fr.loicmathieu.dojo.pattern.lambdaspec;


/**
 * {@link NotSpecification} represents not composition for {@link Specification}.
 *
 * @author 396056
 * @author lmathieu
 *
 * @param <T> The objet type of the specification
 *
 */
public class NotSpecification<T> extends AbstractCompositeSpecification<T>{


	/**
	 * The {@link Specification}
	 * @param specification
	 */
	public NotSpecification(Specification<T> specification) {
		super(specification);
	}

	@Override
	public boolean isSatisfiedBy(T obj) {
		return !specifications.get(0).isSatisfiedBy(obj);
	}

}
