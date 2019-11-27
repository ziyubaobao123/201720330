package ����ʵ��2;

public class Exercise_3_1 {

	private static final short OPERATION_NUMBER=50;
	private static final short COLUMN_NUMBER=5;
	private BinaryOperation_3_1 operationList[] = new BinaryOperation_3_1 [OPERATION_NUMBER];
        
	// ����������������������ǰ�ȼ���Ƿ��Ѿ��������У��Ա����ظ���
	public void generateBinaryExercise() {
		BinaryOperation_3_1 anOperation, opCreator = new BinaryOperation_3_1();
		for(int i=0; i < OPERATION_NUMBER; i++){
			anOperation = opCreator.generateBinaryOperation();
			while (contains(anOperation,i-1)){
				anOperation = opCreator.generateBinaryOperation();
			}
			operationList[i]= anOperation;
		}
	}
	
	public void generateAdditionExercise(){
		BinaryOperation_3_1 anOperation, opCreator = new BinaryOperation_3_1();
		for(int i=0; i < OPERATION_NUMBER; i++){
			anOperation = opCreator.generateAdditionOperation();
			while (contains(anOperation,i-1)){
				anOperation = opCreator.generateAdditionOperation();
			}
			operationList[i]= anOperation;
		}
	}		
	public void generateSubstractExercise(){
		BinaryOperation_3_1 anOperation, opCreator = new BinaryOperation_3_1();
		for(int i=0; i < OPERATION_NUMBER; i++){
			anOperation = opCreator.generateSubstractOperation();
			while (contains(anOperation,i-1)){
				anOperation = opCreator.generateSubstractOperation();
			}
			operationList[i]= anOperation;
		}
	}
		
    // ֻҪ��������ʽû�ڵ�ǰ��ϰ���У��ͼ���β��
	private boolean contains (BinaryOperation_3_1 anOperation, int length){
		boolean found=false;
		for(int i=0; i <= length; i++) {
			// System.out.println("--"+i+"--");
			if (anOperation.equals(operationList[i])){
				found = true;
				break;
			}
		}
		return found;
	}
	
	void formateAndDisplay (){
		int count=1;
		for(int i=0; i < OPERATION_NUMBER; i++) {
			if (count > COLUMN_NUMBER){
				print("\n");
				count = 1;
			}
			print(""+(i+1)+"."+"   ");
			print(operationList[i].asString()+"\t");
			count++;	
		} 
		print("\n");
	}
	
	void printAll(int count){
		for(int i=0; i < count; i++) {
			print(operationList[i].fullString());
			print(", ");
		} 
		System.out.println();
	}
	
	void printAll(){
		for(int i=0; i < OPERATION_NUMBER; i++) {
			print(operationList[i].asString());
			print(", ");
		} 
		print("\n");
	}

	private static void print(String str){
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		// ����һ��Exercise���������ǿ�
        Exercise_3_1 anExercise = new Exercise_3_1();
        
        System.out.println("��Ļ��ʾ50���ӷ������⣺");
        anExercise.generateAdditionExercise();
        anExercise.formateAndDisplay();
        
        System.out.println("��Ļ��ʾ50�����������⣺");
        anExercise.generateSubstractExercise(); 
        anExercise.formateAndDisplay();	
        
        anExercise.generateBinaryExercise();
        System.out.println("��Ļ��ʾ50���ӷ�����������⣺");
        anExercise.formateAndDisplay();
        
	}

}
