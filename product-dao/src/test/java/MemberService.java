import com.sidgs.product.error.MemberException;
import com.sidgs.product.impl.MemberServiceImpl;
import com.sidgs.product.model.Member;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MemberService {

    Log log = LogFactory.getLog(this.getClass());

    @Before
    public void setup(){

    }

    @Test
    public void testList() {

        com.sidgs.product.MemberService memberService = new MemberServiceImpl();
        try {
            List<Member> members = memberService.listAll();
            assert(members!=null && !members.isEmpty());
        } catch (MemberException e) {
            assert(false);
        }


    }

}
