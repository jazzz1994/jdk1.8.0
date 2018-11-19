package lambdas1;

@FunctionalInterface
public interface Converter<F, T> {
	T convert(F from);
	//static method for conversion
	static <A,B> B testConvert(A frm,Converter<A, B> c)
	{
		return c.convert(frm);
	}
	default T test(F from,Converter<F, T> c)
	{
		return c.convert(from);
	}
}
