import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class bai2Tuan1Test {
    @Test
    public void testTinhTongCacSoDuong() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(15, bai2Tuan1.tinhTongCacSoDuong(numbers));
    }

    @Test
    public void testTinhTongVoiSoAm() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3, -4, -5);
        assertEquals(0, bai2Tuan1.tinhTongCacSoDuong(numbers));
    }

    @Test
    public void testTinhTongVoiHonHopSoAmVaDuong() {
        List<Integer> numbers = Arrays.asList(-1, 2, -3, 4, -5);
        assertEquals(6, bai2Tuan1.tinhTongCacSoDuong(numbers));
    }

    @Test
    public void testTinhTongKhiKhongCoSoNao() {
        List<Integer> numbers = Arrays.asList();
        assertEquals(0, bai2Tuan1.tinhTongCacSoDuong(numbers));
    }
}

