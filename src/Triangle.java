class Triangle extends Shape {
    Triangle(){
        super.m_type=3;
    }
    @Override
    public void display() {
        System.out.println("三角形按钮");
    }
}
