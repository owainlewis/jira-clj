(defn get-edit-issue-meta
  "Returns the meta data for editing an issue.
 <p/>
 The fields in the editmeta correspond to the fields in the edit screen for the issue.
 Fields not in the screen will not be in the editmeta."
  [config & [opts]]
  (jira-request config :get))
(defn get-issue-watchers
  "Returns the list of watchers for the issue with the given key."
  [config & [opts]]
  (jira-request config :get))
(defn get-votes
  "A REST sub-resource representing the voters on the issue."
  [config & [opts]]
  (jira-request config :get))
(defn get-sub-tasks
  "Returns an issue's subtask list"
  [config & [opts]]
  (jira-request config :get))
(defn get-comments
  "Returns all comments for an issue.
 <p>
 Results can be ordered by the 'created' field which means the date a comment was added.
 </p>"
  [config & [opts]]
  (jira-request config :get))
(defn get-properties-keys
  "Returns the keys of all properties for the issue identified by the key or by the id."
  [config & [opts]]
  (jira-request config :get))
(defn get-property
  "Returns the value of the property with a given key from the issue identified by the key or by the id. The user who retrieves
 the property is required to have permissions to read the issue."
  [config & [opts]]
  (jira-request config :get))
(defn get-issue-worklog
  "Returns all work logs for an issue. <br/>
 <strong>Note:</strong> Work logs won't be returned if the Log work field is hidden for the project."
  [config & [opts]]
  (jira-request config :get))
(defn get-create-issue-meta
  "Returns the meta data for creating issues. This includes the available projects, issue types and fields,
 including field types and whether or not those fields are required.
 Projects will not be returned if the user does not have permission to create issues in that project.
 <p/>
 The fields in the createmeta correspond to the fields in the create screen for the project/issuetype.
 Fields not in the screen will not be in the createmeta.
 <p/>
 Fields will only be returned if <code>expand=projects.issuetypes.fields</code>.
 <p/>
 The results can be filtered by project and/or issue type, given by the query params."
  [config & [opts]]
  (jira-request config :get))
(defn get-create-issue-meta-fields
  ""
  [config & [opts]]
  (jira-request config :get))
(defn get-remote-issue-links
  "A REST sub-resource representing the remote issue links on the issue."
  [config & [opts]]
  (jira-request config :get))
(defn get-create-issue-meta-project-issue-types
  ""
  [config & [opts]]
  (jira-request config :get))
(defn can-move-sub-task
  ""
  [config & [opts]]
  (jira-request config :get))
(defn get-transitions
  "Get a list of the transitions possible for this issue by the current user, along with fields that are required and their types.
 <p/>
 Fields will only be returned if <code>expand=transitions.fields</code>.
 <p/>
 The fields in the metadata correspond to the fields in the transition screen for that transition.
 Fields not in the screen will not be in the metadata."
  [config & [opts]]
  (jira-request config :get))
(defn get-worklog
  "Returns a specific worklog. <br/>
 <strong>Note:</strong> The work log won't be returned if the Log work field is hidden for the project."
  [config & [opts]]
  (jira-request config :get))
(defn get-comment
  "Returns a single comment."
  [config & [opts]]
  (jira-request config :get))
(defn get-issue
  "Returns a full representation of the issue for the given issue key.
 <p>
 An issue JSON consists of the issue key, a collection of fields,
 a link to the workflow transition sub-resource, and (optionally) the HTML rendered values of any fields that support it
 (e.g. if wiki syntax is enabled for the description or comments).
 <p>
 The <code>fields</code> param (which can be specified multiple times) gives a comma-separated list of fields
 to include in the response. This can be used to retrieve a subset of fields.
 A particular field can be excluded by prefixing it with a minus.
 <p>
 By default, all (<code>*all</code>) fields are returned in this get-issue resource. Note: the default is different
 when doing a jql search -- the default there is just navigable fields (<code>*navigable</code>).
 <ul>
 <li><code>*all</code> - include all fields</li>
 <li><code>*navigable</code> - include just navigable fields</li>
 <li><code>summary,comment</code> - include just the summary and comments</li>
 <li><code>-comment</code> - include everything except comments (the default is <code>*all</code> for get-issue)</li>
 <li><code>*all,-comment</code> - include everything except comments</li>
 </ul>
 <p>
 The {@code properties} param is similar to {@code fields} and specifies a comma-separated list of issue
 properties to include. Unlike {@code fields}, properties are not included by default. To include them all
 send {@code ?properties=*all}. You can also include only specified properties or exclude some properties
 with a minus (-) sign.
 <p>
 <ul>
 <li>{@code *all} - include all properties</li>
 <li>{@code *all, -prop1} - include all properties except {@code prop1} </li>
 <li>{@code prop1, prop1} - include {@code prop1} and {@code prop2} properties </li>
 </ul>
 </p>
 <p/>
 Jira will attempt to identify the issue by the <code>issueIdOrKey</code> path parameter. This can be an issue id,
 or an issue key. If the issue cannot be found via an exact match, Jira will also look for the issue in a case-insensitive way, or
 by looking to see if the issue was moved. In either of these cases, the request will proceed as normal (a 302 or other redirect
 will <b>not</b> be returned). The issue key contained in the response will indicate the current value of issue's key.
 <p/>
 The <code>expand</code> param is used to include, hidden by default, parts of response. This can be used to include:
 <ul>
 <li><code>renderedFields</code> - field values in HTML format</li>
 <li><code>names</code> - display name of each field</li>
 <li><code>schema</code> - schema for each field which describes a type of the field</li>
 <li><code>transitions</code> - all possible transitions for the given issue</li>
 <li><code>operations</code> - all possibles operations which may be applied on issue</li>
 <li><code>editmeta</code> - information about how each field may be edited. It contains field's schema as well.</li>
 <li><code>changelog</code> - history of all changes of the given issue</li>
 <li><code>versionedRepresentations</code> -
 REST representations of all fields. Some field may contain more recent versions. RESET representations are numbered.
 The greatest number always represents the most recent version. It is recommended that the most recent version is used.
 version for these fields which provide a more recent REST representation.
 After including <code>versionedRepresentations</code> 'fields' field become hidden.</li>
 </ul>"
  [config & [opts]]
  (jira-request config :get))
(defn get-remote-issue-link-by-id
  "Get the remote issue link with the given id on the issue."
  [config & [opts]]
  (jira-request config :get))
(defn get-issue-picker-resource
  "Returns suggested issues which match the auto-completion query for the user which executes this request. This REST
 method will check the user's history and the user's browsing context and select this issues, which match the query."
  [config & [opts]]
  (jira-request config :get))
