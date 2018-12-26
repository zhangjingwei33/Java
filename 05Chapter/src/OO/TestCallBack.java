package OO;

/**
 *   �ص��ľ���������£�

      1. Class Aʵ�ֽӿ�CallBack ���� ����1

      2. class A�а���class B������ ��������2

      3. class B��һ������ΪCallBack�ķ���C ��������3

      4. ǰ���������ǵ�׼��������������A�Ķ������B�ķ���C

      5. Ȼ��class B�Ϳ�����C�����е���A�ķ���D
 * 	 ����˵��ҿ��ܻ��ǲ�̫��⣬�������Ǹ���ʾ��5-33��˵���ص����ơ�
 * ��ʾ���������Ϊ����һ��С������һ�����ѵ����⡰ѧϰJavaѡ�ļһ�����?����
 * ���Ǿʹ�绰��С�ߣ�С��һʱҲ��̫�˽����飬�͸�С��˵�������ڻ����£�
 * ��æ���˸�����ѯ��ѯ��С��Ҳ����ɵɵ�����ŵ绰ȥ��С�ߵĴ𰸣�
 * ����С����С��˵���ȹҵ绰�ɣ���֪���𰸺��ٴ��ҵ绰�����Ұɣ�
 * ���ǹ��˵绰��С����ȥ���Լ�������ȥ�ˣ����˼���Сʱ��
 * С�ߴ�绰��С�������������ǡ�ѧJava��Ȼȥ������ѧ�á���
 * @author dell
 *
 */
/*
 * �ص��ӿ�
 */
interface CallBack{
	/**
	 * С��֪���𰸺����С��ʱ��Ҫ���õķ��������ص�����
	 * @param result ������Ĵ�
	 */
	public void answer(String result);
}
/*
 * С���ࣺʵ���˻ص��ӿ�CallBack������һ��
 */
class Liu implements CallBack{
	/**
	 * ����С�߶�������ã���������
	 */
	private Gao gao;
	
	public Liu(Gao gao) {
		this.gao = gao;
	}
	
	/**
	 * С��ͨ���������ȥ��С��
	 * @param question С���ʵ����⡰ѧϰjavaѡ�ļһ����أ���
	 */
	public void askQuestion(String question) {
		//С����С������
		gao.execute(Liu.this,question);
	}
	/**
	 * С��֪���𰸺���ô˷�������С��
	 */
	@Override
	public void answer(String result) {
		System.out.println("С�߸���С���Ĵ���:" + result);
	}
}
/*
 * С����
 */
class Gao{
	/**
	 * �൱��class B ��һ������ΪCallBack�ķ���c (������)
	 */
	public void execute(CallBack callBack,String question) {
		System.out.println("С���ʵ������ǣ�"+question);
		//ģ��С�߹ҵ���Ȱ��Լ������黨�˺ܳ�ʱ��
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		//С�߰����Լ���������뵽�˴�
		String result = "ѧJava��Ȼȥ��ѧ��";
		//С�ߴ�绰�Ѵ𰸸���С�����൱��class B ����������class A��D����
		callBack.answer(result);
	}
}

public class TestCallBack {
	public static void main(String[] args) {
		Gao gao = new Gao();
		Liu liu = new Liu(gao);
		//С��������
		liu.askQuestion("ѧϰJavaѡ�ļһ����أ�");
	}
}
