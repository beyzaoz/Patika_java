package Interface;

import java.util.List;

public interface Student {
    void mezunolma(int studentId) throws Exception;

    float ortalama();

    default List<String> dersIsimleri(){

        return List.of("Kimya","Biyoloji","Matematik");
    }
}