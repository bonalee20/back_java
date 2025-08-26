package castingTask2;

public class Charactor {
	String name;
	public Charactor() {;}
	public Charactor(String name) {
		this.name = name;
	}
	
	// 
	void kill(NotPlayerCharcter npc) {
		if(npc instanceof Oak) {
			npc.hunt();
			npc.drop();
			Oak oak =(Oak)npc;
			oak.face();
		}else if(npc instanceof Fairy) {
			npc.hunt();
			npc.drop();
			Fairy fairy = (Fairy)npc;
			fairy.wing();
		}else if(npc instanceof Human) {
			npc.hunt();
			npc.drop();
			
		}else {
			
		}
	}
	
}
