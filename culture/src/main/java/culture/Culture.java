package culture;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Culture {
    private static List<String> values;
    static {
        values = new ArrayList<>();
        //感恩
        values.add("感恩公司提供的工作与发展的机会,转化为工作动力回报公司;");
        values.add("感恩上级的指导,同事的帮助,互帮互助;");
        values.add("感恩客户的支持,为客户提供最优质的服务;");
        values.add("感恩社会帮助,关注社会发展,关心弱势群体,承担更多的社会责任;");
        values.add("将感恩转化为实际行动,在力所能及范围内多帮助别人;");
        //创新
        values.add("接受并快速适应公司因战略或业务发展需要的任何调整;");
        values.add("结合目标及任务,不断优化完善现有的工作;");
        values.add("在工作中有前瞻意识,建立新方法,新思路;");
        values.add("对创新过程中产生的困难和挫折,能自我调整,并正面影响和带动同事解决问题;");
        values.add("不墨守成规,不断优化完善工作,并带来绩效突破性提高或给公司创造较大的贡献;");
        //服务
        values.add("尊重他人,随时随地维护公司的形象,传递公司服务理念;");
        values.add("始终保持良好的服务态度,积极主动地为客户解决问题,提升用户满意度;");
        values.add("及时跟进客户问题,积极协助并跟踪解决;");
        values.add("深入研究客户的需求及痛点,提供超出客户预期的优质服务;");
        values.add("以服务好客户为要务,不畏困难与阻碍,为客户创造不可替代的价值;");
        //诚信
        values.add("诚实正直,表里如一;");
        values.add("表达观点要言之有理,不虚构,不夸大;");
        values.add("不传播未经证实的消息,不发表不负责任的言论,并对未经证实的消息能正面引导;");
        values.add("勇于承认错误,敢于承担责任,并及时改正;");
        values.add("对损害公司利益的不诚信行为做正确有效地制止;");
        //团结
        values.add("积极融入团队,乐意帮助同事,配合团队完成工作;");
        values.add("尊重不同的意见,为团队提供有效解决方案,并全力配合团队工作;");
        values.add("积极分享专业知识和经验,主动给予同事必要的帮助;");
        values.add("善于和不同类型的同事合作,不将个人喜好带入工作,充分体现'对事不对人'的原则;");
        values.add("有主人翁意识,积极正面地影响团队,改善团队士气和氛围,团队利益为先,个人利益为后;");
        //不抱怨
        values.add("适应公司因业务发展或战略转型而做出的决策,在理解中执行,在执行中理解;");
        values.add("通过正确途径,正确的方式表达个人情绪;");
        values.add("面对变化,理性对待,充分沟通,诚意配合;");
        values.add("遇困难能用积极的思维思考,客观分析,寻找解决方法;");
        values.add("面对变化,积极配合各项工作,正面影响,引导他人;");
        //激情
        values.add("热爱自己的工作,理解,认同,践行公司企业文化;");
        values.add("热爱公司,顾全大局,不计较个人得失;");
        values.add("保持积极乐观的心态,碰到困难和挫折的时候永不放弃;");
        values.add("始终以乐观主义的精神和必胜的信念,影响并带动同事和团队;");
        values.add("不断设定更高的目标,今天的最好表现是明天的最低要求;");
        //责任
        values.add("坚持工作原则,按时保质保量完成本职工作;");
        values.add("工作中遇到困难和挑战时,不畏难,寻找办法解决;");
        values.add("时刻牢记使命始终恪守职责,提升专业能力;");
        values.add("当公司财产,利益受到威胁时,及时保护公司财产免受损失;");
        values.add("在完成本职工作的前提下,积极参与社会公益活动;");
        //简单
        values.add("人际关系简单,工作遵循对事不对人的原则;");
        values.add("工作上追求简单,高效的方式方法;");
        values.add("对工作进行计划,协调与管控,提升工作效率;");
        values.add("根据轻重缓急来安排工作优先级,保证各项工作有序完成;");
        values.add("化繁为简,用较小的投入获得较大的工作成果;");
    }
    public static void main(String[] args) {
        Random rand = new Random();
        while(!values.isEmpty()){
            int i= rand.nextInt(values.size());
            System.out.println(values.get(i));
            values.remove(i);
        }
    }
}