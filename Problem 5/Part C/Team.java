import java.util.Set;
import java.util.HashSet;

public class Team
{
      private int code;
      private Set<Player> players;

      public Team()
      {
	  // By default we set the code to -1, indicating it hasn't been set yet by an accessor)
	  this.code = -1;
	  this.players = new HashSet<Player>();

      }

      public void addPlayer(Player player)
      {
	  players.add(player);
      }

      // The multiplicity of 1..* is enforced by the accessors, so a player must be added to the team before accessing the team.
      public Set<Player> getPlayers() {
	  if (players.isEmpty()) {
	        throw new IllegalStateException("Team must have at least one player");
	  }
	  return new HashSet<>(players);
      }

      // Other accessors omitted
}
