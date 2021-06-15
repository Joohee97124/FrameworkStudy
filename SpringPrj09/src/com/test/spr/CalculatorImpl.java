/*=======================================
 * CalculatorImpl.java
 - Calclator 인터페이스를 구현하는 클래스
 - 주 업무가 적용된 클래스
=======================================*/

// 여기서 만드는 게 정미,,! = CalculatorImpl
// Calculator 인터페이스 = 정미의 부모님 (패밀리)
// 보조업무와 뒤섞여있지 않고 딱 주업무만 가지고 있다! 

package com.test.spr;

public class CalculatorImpl implements Calculator
{

	// 주 업무 (core concern) 진행을 위한 메소드 구현
	
	@Override
	public int add(int x, int y)
	{
		int result = 0;
		
		// ※ 주 업무 (core concern) 에서 예외가 발생하는 상황을 만들기 위해
		//	  예외 객체 생성
		//	  - try ~ catch ~ finally : 예외 발생 시 자체적으로 처리
		//	  - throws : 예외 발생 시 자신을 호출한 객체에 예외 넘기는 처리
		//	  - throw : 예외를 인위적으로 발생시키는 처리
		
		if (x>100 || y>100)
		{
			throw new IllegalArgumentException("100 보다 큰 인자를 전달한 예외 발생");
			
		}
		
		result = x + y;
		System.out.printf("%d + %d = %d%n", x, y, result);
		
		return result;
		
	}

	@Override
	public int sub(int x, int y)
	{
		int result = 0;
		
		result = x - y;
		System.out.printf("%d - %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int multi(int x, int y)
	{
		int result = 0;
		
		result = x * y;
		System.out.printf("%d * %d = %d%n", x, y, result);
		
		return result;
	}

	@Override
	public int div(int x, int y)
	{
		int result = 0;
		
		result = x / y;
		System.out.printf("%d / %d = %d%n", x, y, result);
		
		return result;
	}
	
	
}