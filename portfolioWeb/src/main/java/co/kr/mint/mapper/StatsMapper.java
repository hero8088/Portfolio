
package co.kr.mint.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import co.kr.mint.model.Stats;

@Repository("statsMapper")
public interface StatsMapper {
	public int createStats(Stats stats);
	
	public List<Stats>selectTime(String stTime);
	
	public List<Stats>selectBrowser();
}
