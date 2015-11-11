
package api.domain.model.user.fitness;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FitnessTestResponse {

    /**
     * Url to a previous page
     * 
     */
    private String previousPage;
    /**
     * Url to a next page
     * 
     */
    private String nextPage;
    private int startIndex;
    /**
     * Items on page
     * 
     */
    private int itemsPerPage;
    /**
     * Total number of results for the request
     * 
     */
    private int totalResults;
    /**
     * Results array
     * 
     */
    private List<Result> results = new ArrayList<Result>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Url to a previous page
     * 
     * @return
     *     The previousPage
     */
    public String getPreviousPage() {
        return previousPage;
    }

    /**
     * Url to a previous page
     * 
     * @param previousPage
     *     The previousPage
     */
    public void setPreviousPage(String previousPage) {
        this.previousPage = previousPage;
    }

    /**
     * Url to a next page
     * 
     * @return
     *     The nextPage
     */
    public String getNextPage() {
        return nextPage;
    }

    /**
     * Url to a next page
     * 
     * @param nextPage
     *     The nextPage
     */
    public void setNextPage(String nextPage) {
        this.nextPage = nextPage;
    }

    /**
     * 
     * @return
     *     The startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 
     * @param startIndex
     *     The startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * Items on page
     * 
     * @return
     *     The itemsPerPage
     */
    public int getItemsPerPage() {
        return itemsPerPage;
    }

    /**
     * Items on page
     * 
     * @param itemsPerPage
     *     The itemsPerPage
     */
    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * Total number of results for the request
     * 
     * @return
     *     The totalResults
     */
    public int getTotalResults() {
        return totalResults;
    }

    /**
     * Total number of results for the request
     * 
     * @param totalResults
     *     The totalResults
     */
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    /**
     * Results array
     * 
     * @return
     *     The results
     */
    public List<Result> getResults() {
        return results;
    }

    /**
     * Results array
     * 
     * @param results
     *     The results
     */
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
