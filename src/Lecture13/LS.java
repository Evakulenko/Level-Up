package Lecture13;

import java.io.File;

/**
 * Created by ������� on 18.08.2015.
 */
public class LS extends CommandResolver{
    String url;

    @Override
    public boolean isWork(String a) {
        this.url = a.substring(3);
        return (a.substring(0,2) == "ls");
    }
//    ���� ������ �� �������� ���������� � ��� �� ������ - ������� �����
//    � ��� ��� �������� �� ������ ���������� �� ��������������
//    (������ ����� ������� � �� ������, ����� ��������
//    ��������� �� ����� ����������� � ������� ��� ������� � ������ �����
//    � ���������� ���������� �����������). ���� ���������� ����
//    �� ������ - ������� ��� ���� �� ������. ���� ����� �� �������� ������ true - ������� ��� ����\����� ������� ��������
    @Override
    public String work() {
        File file = new File(url);
        if (file.isFile() && file.exists()){
            file.deleteOnExit();
            return "File is deleted";
        }

    }
}