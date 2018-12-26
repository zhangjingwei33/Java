package OO;

/**
 *   回调的具体过程如下：

      1. Class A实现接口CallBack —— 背景1

      2. class A中包含class B的引用 ——背景2

      3. class B有一个参数为CallBack的方法C ——背景3

      4. 前三条是我们的准备条件，接下来A的对象调用B的方法C

      5. 然后class B就可以在C方法中调用A的方法D
 * 	 这样说大家可能还是不太理解，下面我们根据示例5-33来说明回调机制。
 * 该示例的生活背景为：有一天小刘遇到一个很难的问题“学习Java选哪家机构呢?”，
 * 于是就打电话问小高，小高一时也不太了解行情，就跟小刘说，我现在还有事，
 * 等忙完了给你咨询咨询，小刘也不会傻傻的拿着电话去等小高的答案，
 * 于是小刘对小高说，先挂电话吧，你知道答案后再打我电话告诉我吧，
 * 于是挂了电话。小高先去办自己的事情去了，过了几个小时，
 * 小高打电话给小刘，告诉他答案是“学Java当然去北京尚学堂”。
 * @author dell
 *
 */
/*
 * 回调接口
 */
interface CallBack{
	/**
	 * 小高知道答案后告诉小刘时需要调用的方法，即回调方法
	 * @param result 是问题的答案
	 */
	public void answer(String result);
}
/*
 * 小刘类：实现了回调接口CallBack（背景一）
 */
class Liu implements CallBack{
	/**
	 * 包含小高对象的引用（背景二）
	 */
	private Gao gao;
	
	public Liu(Gao gao) {
		this.gao = gao;
	}
	
	/**
	 * 小刘通过这个方法去问小高
	 * @param question 小刘问的问题“学习java选哪家机构呢？”
	 */
	public void askQuestion(String question) {
		//小刘问小高问题
		gao.execute(Liu.this,question);
	}
	/**
	 * 小高知道答案后调用此方法告诉小刘
	 */
	@Override
	public void answer(String result) {
		System.out.println("小高告诉小刘的答案是:" + result);
	}
}
/*
 * 小高类
 */
class Gao{
	/**
	 * 相当于class B 有一个参数为CallBack的方法c (背景三)
	 */
	public void execute(CallBack callBack,String question) {
		System.out.println("小刘问的问题是："+question);
		//模拟小高挂电后先办自己的事情花了很长时间
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//小高办完自己的事情后想到了答案
		String result = "学Java当然去尚学堂";
		//小高打电话把答案告诉小刘，相当于class B 反过来调用class A的D方法
		callBack.answer(result);
	}
}

public class TestCallBack {
	public static void main(String[] args) {
		Gao gao = new Gao();
		Liu liu = new Liu(gao);
		//小刘问问题
		liu.askQuestion("学习Java选哪家机构呢？");
	}
}
