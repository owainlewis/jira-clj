(defn getA11yPersonalSettings
Returns available accessibility personal settings along with `enabled` property
 that indicates the currently logged-in user preference.
[config & [opts]]
(jira-request config method))
(defn getProjectRoles
Get all the ProjectRoles available in Jira. Currently this list is global.
[config & [opts]]
(jira-request config method))
(defn getAllProjectCategories
Returns all project categories
[config & [opts]]
(jira-request config method))
(defn findAssignableUsers
Returns a list of users that match the search string. This resource cannot be accessed anonymously.
 Please note that this resource should be called with an issue key when a list of assignable users is retrieved
 for editing.  For create only a project key should be supplied.  The list of assignable users may be incorrect
 if it's called with the project key for editing.
[config & [opts]]
(jira-request config method))
(defn getProjectCategoryById
Contains a representation of a project category in JSON format.
[config & [opts]]
(jira-request config method))
(defn getCustomFieldOption
Returns a full representation of the Custom Field Option that has the given id.
[config & [opts]]
(jira-request config method))
(defn getRemoteVersionLinksByVersionId
Returns the remote version links associated with the given version ID.
[config & [opts]]
(jira-request config method))
(defn getFavouriteFilters
Returns the favourite filters of the logged-in user.
[config & [opts]]
(jira-request config method))
(defn getAllAvatars
Returns all avatars which are visible for the currently logged in user.
[config & [opts]]
(jira-request config method))
(defn getProject
Contains a full representation of a project in JSON format.
 <p>
 All project keys associated with the project will only be returned if <code>expand=projectKeys</code>.
 <p>
[config & [opts]]
(jira-request config method))
(defn getWorkflow
Returns the workflow mappings or requested mapping to the caller for the passed scheme.
[config & [opts]]
(jira-request config method))
(defn findBulkAssignableUsers
Returns a list of users that match the search string and can be assigned issues for all the given projects.
[config & [opts]]
(jira-request config method))
(defn getAllAvatars
Returns all avatars which are visible for the currently logged in user.  The avatars are grouped into
 system and custom.
[config & [opts]]
(jira-request config method))
(defn getAllFields
Gets all fields for a given tab
[config & [opts]]
(jira-request config method))
(defn getUser
Returns currently logged user. This resource cannot be accessed anonymously.
[config & [opts]]
(jira-request config method))
(defn validateUserAnonymizationRerun
Validates user anonymization re-run process.
[config & [opts]]
(jira-request config method))
(defn getEditIssueMeta
Returns the meta data for editing an issue.
 <p/>
 The fields in the editmeta correspond to the fields in the edit screen for the issue.
 Fields not in the screen will not be in the editmeta.
[config & [opts]]
(jira-request config method))
(defn getPermissionScheme
Returns a permission scheme identified by the given id.
[config & [opts]]
(jira-request config method))
(defn getIssueWatchers
Returns the list of watchers for the issue with the given key.
[config & [opts]]
(jira-request config method))
(defn findUsers
Returns a list of users that match the search string. This resource cannot be accessed anonymously.
[config & [opts]]
(jira-request config method))
(defn getAdvancedSettings
Returns the properties that are displayed on the "General Configuration > Advanced Settings" page.
[config & [opts]]
(jira-request config method))
(defn getRecords
Returns auditing records filtered using provided parameters
[config & [opts]]
(jira-request config method))
(defn getAllPermissions
Returns all permissions that are present in the Jira instance - Global, Project and the global ones added by plugins
[config & [opts]]
(jira-request config method))
(defn getProjectRolesById
Get a specific ProjectRole available in Jira.
[config & [opts]]
(jira-request config method))
(defn getNotificationSchemes
Returns a <a href="#pagination">paginated</a> list of notification schemes. In order to access notification scheme, the calling user is
 required to have permissions to administer at least one project associated with the requested notification scheme. Each scheme contains
 a list of events and recipient configured to receive notifications for these events. Consumer should allow events without recipients to appear in response.
 The list is ordered by the scheme's name.
 Follow the documentation of /notificationscheme/{id} resource for all details about returned value.
[config & [opts]]
(jira-request config method))
(defn getIdsOfWorklogsDeletedSince
Returns worklogs id and delete time of worklogs that was deleted since given time.
 The returns set of worklogs is limited to 1000 elements.
 This API will not return worklogs deleted during last minute.
[config & [opts]]
(jira-request config method))
(defn getDuplicatedUsersCount
Returns the number of users whose accounts are duplicated.
 Duplicated means that the user has an account in more than one directory
 and either more than one account is active or the only active account does not belong to the directory
 with the highest priority.
 The data returned by this endpoint is cached for 10 minutes and the cache is flushed when any User Directory
 is added, removed, enabled, disabled, or synchronized.
 A System Administrator can also flush the cache manually.
 Related JAC ticket: https://jira.atlassian.com/browse/JRASERVER-68797
[config & [opts]]
(jira-request config method))
(defn getProperties
Return the property or properties associated with a transition.
[config & [opts]]
(jira-request config method))
(defn expandForMachines
Tries to expand an attachment. Output is raw and should be backwards-compatible through the course of time.
[config & [opts]]
(jira-request config method))
(defn getProperty
Returns the value of the property with a given key from the dashboard item identified by the id.
 The user who retrieves the property is required to have permissions to read the dashboard item.
[config & [opts]]
(jira-request config method))
(defn getGroup
Returns REST representation for the requested group. Allows to get list of active users belonging to the
 specified group and its subgroups if "users" expand option is provided. You can page through users list by using
 indexes in expand param. For example to get users from index 10 to index 15 use "users[10:15]" expand value. This
 will return 6 users (if there are at least 16 users in this group). Indexes are 0-based and inclusive.
 <p>
 This resource is deprecated, please use group/member API instead.
[config & [opts]]
(jira-request config method))
(defn getDashboard
Returns a single dashboard.
[config & [opts]]
(jira-request config method))
(defn getPasswordPolicy
Returns the list of requirements for the current password policy. For example, "The password must have at least 10 characters.",
 "The password must not be similar to the user's name or email address.", etc.
[config & [opts]]
(jira-request config method))
(defn getProjectVersions
Contains a full representation of a the specified project's versions.
[config & [opts]]
(jira-request config method))
(defn getVotes
A REST sub-resource representing the voters on the issue.
[config & [opts]]
(jira-request config method))
(defn getPermissionSchemeGrant
Returns a permission grant identified by the given id.
[config & [opts]]
(jira-request config method))
(defn getDraftWorkflow
Returns the draft workflow mappings or requested mapping to the caller.
[config & [opts]]
(jira-request config method))
(defn getUsersFromGroup
This resource returns a <a href="#pagination">paginated</a> list of users who are members of the specified group and its subgroups.
 Users in the page are ordered by user names. User of this resource is required to have sysadmin or admin permissions.
[config & [opts]]
(jira-request config method))
(defn getAccessibleProjectTypeByKey
Returns the project type with the given key, if it is accessible to the logged in user.
 This takes into account whether the user is licensed on the Application that defines the project type.
[config & [opts]]
(jira-request config method))
(defn getAttachmentMeta
Returns the meta information for an attachments, specifically if they are enabled and the maximum upload size
 allowed.
[config & [opts]]
(jira-request config method))
(defn getAllStatuses
Get all issue types with valid status values for a project
[config & [opts]]
(jira-request config method))
(defn getPermissionSchemes
Returns a list of all permission schemes.
 <p>
 By default only shortened beans are returned. If you want to include permissions of all the schemes,
 then specify the <b>permissions</b> expand parameter. Permissions will be included also if you specify
 any other expand parameter.
 </p>
[config & [opts]]
(jira-request config method))
(defn getIssueType
Returns a full representation of the issue type that has the given id.
[config & [opts]]
(jira-request config method))
(defn getDraftDefault
Return the default workflow from the passed draft workflow scheme to the caller.
[config & [opts]]
(jira-request config method))
(defn getProgressBulk
Retrieves the progress of a multiple reindex requests.  Only reindex requests that actually exist will be returned
 in the results.
[config & [opts]]
(jira-request config method))
(defn getById
Returns the requested workflow scheme to the caller.
[config & [opts]]
(jira-request config method))
(defn getStatusCategories
Returns a list of all status categories
[config & [opts]]
(jira-request config method))
(defn getReindexProgress
Returns information on the system reindexes.  If a reindex is currently taking place then information about this reindex is returned.
 If there is no active index task, then returns information about the latest reindex task run, otherwise returns a 404
 indicating that no reindex has taken place.
[config & [opts]]
(jira-request config method))
(defn getSecurityLevelsForProject
Returns all security levels for the project that the current logged in user has access to.
 If the user does not have the Set Issue Security permission, the list will be empty.
[config & [opts]]
(jira-request config method))
(defn getAssignedPriorityScheme
Gets a full representation of a priority scheme in JSON format used by specified project.
 User must be global administrator or project administrator.

 All project keys associated with the priority scheme will only be returned if additional query parameter is provided <code>expand=projectKeys</code>.
[config & [opts]]
(jira-request config method))
(defn getProject
Validates a project key.
[config & [opts]]
(jira-request config method))
(defn getVersionUnresolvedIssues
Returns the number of unresolved issues for the given version
[config & [opts]]
(jira-request config method))
(defn getCustomFields

[config & [opts]]
(jira-request config method))
(defn getAssignedPermissionScheme
Gets a permission scheme assigned with a project.
[config & [opts]]
(jira-request config method))
(defn getSubTasks
Returns an issue's subtask list
[config & [opts]]
(jira-request config method))
(defn getComments
Returns all comments for an issue.
 <p>
 Results can be ordered by the "created" field which means the date a comment was added.
 </p>
[config & [opts]]
(jira-request config method))
(defn findUsersForPicker
Returns a list of users matching query with highlighting.
[config & [opts]]
(jira-request config method))
(defn getPropertiesKeys
Returns the keys of all properties for the issue identified by the key or by the id.
[config & [opts]]
(jira-request config method))
(defn expandForHumans
Tries to expand an attachment. Output is human-readable and subject to change.
[config & [opts]]
(jira-request config method))
(defn getProperty
Returns the value of the property with a given key from the issue identified by the key or by the id. The user who retrieves
 the property is required to have permissions to read the issue.
[config & [opts]]
(jira-request config method))
(defn getIssueLink
Returns an issue link with the specified id.
[config & [opts]]
(jira-request config method))
(defn getIndexSummary
Summarizes index condition of current node.
 <p/>
 Returned data consists of:
 <ul>
 <li><code>nodeId</code> - Node identifier.</li>
 <li><code>reportTime</code> - Time of this report creation.</li>
 <li><code>issueIndex</code> - Summary of issue index status.</li>
 <li><code>replicationQueues</code> - Map of index replication queues, where
 keys represent nodes from which replication operations came from.</li>
 </ul>
 <p/>
 <code>issueIndex</code> can contain:
 <ul>
 <li><code>indexReadable</code> - If <code>false</code> the end point failed to read data from issue index
 (check Jira logs for detailed stack trace), otherwise <code>true</code>.
 When <code>false</code> other fields of <code>issueIndex</code> can be not visible.</li>
 <li><code>countInDatabase</code> - Count of issues found in database.</li>
 <li><code>countInIndex</code> - Count of issues found while querying index.</li>
 <li><code>lastUpdatedInDatabase</code> - Time of last update of issue found in database.</li>
 <li><code>lastUpdatedInIndex</code> - Time of last update of issue found while querying index.</li>
 </ul>
 <p/>
 <code>replicationQueues</code>'s map values can contain:
 <ul>
 <li><code>lastConsumedOperation</code> - Last executed index replication operation by current node from sending node's queue.</li>
 <li><code>lastConsumedOperation.id</code> - Identifier of the operation.</li>
 <li><code>lastConsumedOperation.replicationTime</code> - Time when the operation was sent to other nodes.</li>
 <li><code>lastOperationInQueue</code> - Last index replication operation in sending node's queue.</li>
 <li><code>lastOperationInQueue.id</code> - Identifier of the operation.</li>
 <li><code>lastOperationInQueue.replicationTime</code> - Time when the operation was sent to other nodes.</li>
 <li><code>queueSize</code> - Number of operations in queue from sending node to current node.</li>
 </ul>
[config & [opts]]
(jira-request config method))
(defn getNotificationScheme
Returns a full representation of the notification scheme for the given id. This resource will return a
 notification scheme containing a list of events and recipient configured to receive notifications for these events. Consumer
 should allow events without recipients to appear in response. User accessing
 the data is required to have permissions to administer at least one project associated with the requested notification scheme.
 <p>
 Notification recipients can be:
 <ul>
 <li>current assignee - the value of the notificationType is CurrentAssignee</li>
 <li>issue reporter - the value of the notificationType is Reporter</li>
 <li>current user - the value of the notificationType is CurrentUser</li>
 <li>project lead - the value of the notificationType is ProjectLead</li>
 <li>component lead - the value of the notificationType is ComponentLead</li>
 <li>all watchers - the value of the notification type is AllWatchers</li>
 <li>configured user - the value of the notification type is User. Parameter will contain key of the user. Information about the user will be provided
 if <b>user</b> expand parameter is used. </li>
 <li>configured group - the value of the notification type is Group. Parameter will contain name of the group. Information about the group will be provided
 if <b>group</b> expand parameter is used. </li>
 <li>configured email address - the value of the notification type is EmailAddress, additionally information about the email will be provided.</li>
 <li>users or users in groups in the configured custom fields - the value of the notification type is UserCustomField or GroupCustomField. Parameter
 will contain id of the custom field. Information about the field will be provided if <b>field</b> expand parameter is used. </li>
 <li>configured project role - the value of the notification type is ProjectRole. Parameter will contain project role id. Information about the project role
 will be provided if <b>projectRole</b> expand parameter is used. </li>
 </ul>
 Please see the example for reference.
 </p>
 The events can be Jira system events or events configured by administrator. In case of the system events, data about theirs
 ids, names and descriptions is provided. In case of custom events, the template event is included as well.
[config & [opts]]
(jira-request config method))
(defn getProgress
Returns information about a user anonymization operation progress.
[config & [opts]]
(jira-request config method))
(defn getFieldsToAdd
Gets available fields for screen. i.e ones that haven't already been added.
[config & [opts]]
(jira-request config method))
(defn defaultColumns
Returns the default columns for the given user. Admin permission will be required to get columns for a user
 other than the currently logged in user.
[config & [opts]]
(jira-request config method))
(defn findUsersAndGroups
Returns a list of users and groups matching query with highlighting. This resource cannot be accessed
 anonymously.
[config & [opts]]
(jira-request config method))
(defn getFieldAutoCompleteForQueryString
Returns auto complete suggestions for JQL search.
[config & [opts]]
(jira-request config method))
(defn getReindexInfo
Returns information on the system reindexes.  If a reindex is currently taking place then information about this reindex is returned.
 If there is no active index task, then returns information about the latest reindex task run, otherwise returns a 404
 indicating that no reindex has taken place.
[config & [opts]]
(jira-request config method))
(defn getProperty
Returns an application property.
[config & [opts]]
(jira-request config method))
(defn getFilter
Returns a filter given an id
[config & [opts]]
(jira-request config method))
(defn getIssueType
Returns the issue type mapping for the passed workflow scheme.
[config & [opts]]
(jira-request config method))
(defn list
Returns a list of all dashboards, optionally filtering them.
[config & [opts]]
(jira-request config method))
(defn getAssociatedProjects
For the specified issue type scheme, returns all of the associated projects. (Admin required)
[config & [opts]]
(jira-request config method))
(defn getFields
Returns a list of all fields, both System and Custom
[config & [opts]]
(jira-request config method))
(defn getProperty
Returns the value of the property with a given key from the issue type identified by the id. The user who retrieves
 the property is required to have permissions to view the issue type.
[config & [opts]]
(jira-request config method))
(defn getPrioritySchemes
Returns all priority schemes.

 All project keys associated with the priority scheme will only be returned if additional query parameter is provided <code>expand=schemes.projectKeys</code>.
[config & [opts]]
(jira-request config method))
(defn getProperty
Returns the value of the property with a given key from the user identified by the key or by the id. The user who retrieves
 the property is required to have permissions to read the user.
[config & [opts]]
(jira-request config method))
(defn getComponentRelatedIssues
Returns counts of issues related to this component.
[config & [opts]]
(jira-request config method))
(defn getProjectVersionsPaginated
Returns all versions for the specified project. Results are <a href="#pagination">paginated</a>.
 <p>
 Results can be ordered by the following fields:
 <ul>
 <li>sequence</li>
 <li>name</li>
 <li>startDate</li>
 <li>releaseDate</li>
 </ul>
 </p>
[config & [opts]]
(jira-request config method))
(defn getProperty
Returns the value of the property with a given key from the project identified by the key or by the id. The user who retrieves
 the property is required to have permissions to read the project.
[config & [opts]]
(jira-request config method))
(defn getProjectRoleActorsForRole
Gets default actors for the given role.
[config & [opts]]
(jira-request config method))
(defn getSharePermissions
Returns all share permissions of the given filter.
[config & [opts]]
(jira-request config method))
(defn getIssuesecuritylevel
Returns a full representation of the security level that has the given id.
[config & [opts]]
(jira-request config method))
(defn search
Searches for issues using JQL.
 <p>
 <b>Sorting</b>
 the <code>jql</code> parameter is a full <a href="http://confluence.atlassian.com/display/JIRA/Advanced+Searching">JQL</a>
 expression, and includes an <code>ORDER BY</code> clause.
 </p>
 <p>
 The <code>fields</code> param (which can be specified multiple times) gives a comma-separated list of fields
 to include in the response. This can be used to retrieve a subset of fields.
 A particular field can be excluded by prefixing it with a minus.
 <p>
 By default, only navigable (<code>*navigable</code>) fields are returned in this search resource. Note: the default is different
 in the get-issue resource -- the default there all fields (<code>*all</code>).
 <ul>
 <li><code>*all</code> - include all fields</li>
 <li><code>*navigable</code> - include just navigable fields</li>
 <li><code>summary,comment</code> - include just the summary and comments</li>
 <li><code>-description</code> - include navigable fields except the description (the default is <code>*navigable</code> for search)</li>
 <li><code>*all,-comment</code> - include everything except comments</li>
 </ul>
 <p>
 </p>
 <p><b>GET vs POST:</b>
 If the JQL query is too large to be encoded as a query param you should instead
 POST to this resource.
 </p>
 <p>
 <b>Expanding Issues in the Search Result:</b>
 It is possible to expand the issues returned by directly specifying the expansion on the expand parameter passed
 in to this resources.
 </p>
 <p>
 For instance, to expand the &quot;changelog&quot; for all the issues on the search result, it is neccesary to
 specify &quot;changelog&quot; as one of the values to expand.
 </p>
[config & [opts]]
(jira-request config method))
(defn getNotificationScheme
Gets a notification scheme associated with the project.
 Follow the documentation of /notificationscheme/{id} resource for all details about returned value.
[config & [opts]]
(jira-request config method))
(defn getProjectRole
Returns the details for a given project role in a project.
[config & [opts]]
(jira-request config method))
(defn getState

[config & [opts]]
(jira-request config method))
(defn getIssueWorklog
Returns all work logs for an issue. <br/>
 <strong>Note:</strong> Work logs won't be returned if the Log work field is hidden for the project.
[config & [opts]]
(jira-request config method))
(defn getResolutions
Returns a list of all resolutions.
[config & [opts]]
(jira-request config method))
(defn getServerInfo
Returns general information about the current Jira server.
[config & [opts]]
(jira-request config method))
(defn getUpgradeResult
Returns the result of the last upgrade task.

 Returns {@link javax.ws.rs.core.Response#seeOther(java.net.URI)} if still running.
[config & [opts]]
(jira-request config method))
(defn getCreateIssueMeta
Returns the meta data for creating issues. This includes the available projects, issue types and fields,
 including field types and whether or not those fields are required.
 Projects will not be returned if the user does not have permission to create issues in that project.
 <p/>
 The fields in the createmeta correspond to the fields in the create screen for the project/issuetype.
 Fields not in the screen will not be in the createmeta.
 <p/>
 Fields will only be returned if <code>expand=projects.issuetypes.fields</code>.
 <p/>
 The results can be filtered by project and/or issue type, given by the query params.
[config & [opts]]
(jira-request config method))
(defn getCreateIssueMetaFields

[config & [opts]]
(jira-request config method))
(defn getIssueLinkTypes
Returns a list of available issue link types, if issue linking is enabled.
 Each issue link type has an id, a name and a label for the outward and inward link relationship.
[config & [opts]]
(jira-request config method))
(defn getSharePermission
Returns a single share permission of the given filter.
[config & [opts]]
(jira-request config method))
(defn getAllWorkflows
Returns all workflows.
[config & [opts]]
(jira-request config method))
(defn getPropertiesKeys
Returns the keys of all properties for the dashboard item identified by the id.
[config & [opts]]
(jira-request config method))
(defn getRemoteIssueLinks
A REST sub-resource representing the remote issue links on the issue.
[config & [opts]]
(jira-request config method))
(defn getPropertiesKeys
Returns the keys of all properties for the project identified by the key or by the id.
[config & [opts]]
(jira-request config method))
(defn getSchemeAttribute

[config & [opts]]
(jira-request config method))
(defn getProperty
Returns the value of the property with a given key from the comment identified by the key or by the id. The user who retrieves
 the property is required to have permissions to read the comment.
[config & [opts]]
(jira-request config method))
(defn getResolution
Returns a resolution.
[config & [opts]]
(jira-request config method))
(defn getWorkflowSchemeForProject
Returns the workflow scheme that is associated with requested project.
[config & [opts]]
(jira-request config method))
(defn getCreateIssueMetaProjectIssueTypes

[config & [opts]]
(jira-request config method))
(defn getIssueNavigatorDefaultColumns
Returns the default system columns for issue navigator. Admin permission will be required.
[config & [opts]]
(jira-request config method))
(defn getPriorities
Returns a list of all issue priorities.
[config & [opts]]
(jira-request config method))
(defn getAvatars

[config & [opts]]
(jira-request config method))
(defn getAllProjects
Returns all projects which are visible for the currently logged in user. If no user is logged in, it returns the
 list of projects that are visible when using anonymous access.
[config & [opts]]
(jira-request config method))
(defn getDuplicatedUsersMapping
Returns duplicated users mapped to their directories with an indication if their accounts are active or not.
 Duplicated means that the user has an account in more than one directory and either more than one account is active
 or the only active account does not belong to the directory with the highest priority.
 The data returned by this endpoint is cached for 10 minutes and the cache is flushed when any User Directory
 is added, removed, enabled, disabled, or synchronized.
 A System Administrator can also flush the cache manually.
 Related JAC ticket: https://jira.atlassian.com/browse/JRASERVER-68797
[config & [opts]]
(jira-request config method))
(defn getProjectTypeByKey
Returns the project type with the given key.
[config & [opts]]
(jira-request config method))
(defn getPriorityScheme
Gets a full representation of a priority scheme in JSON format.

 All project keys associated with the priority scheme will only be returned if additional query parameter is provided <code>expand=projectKeys</code>.
[config & [opts]]
(jira-request config method))
(defn get
Returns the ApplicationRole with passed key if it exists.
[config & [opts]]
(jira-request config method))
(defn getAutoComplete
Returns the auto complete data required for JQL searches.
[config & [opts]]
(jira-request config method))
(defn getIssueAllTypes
Returns a list of all issue types visible to the user
[config & [opts]]
(jira-request config method))
(defn findGroups
Returns groups with substrings matching a given query. This is mainly for use with
 the group picker, so the returned groups contain html to be used as picker suggestions.
 The groups are also wrapped in a single response object that also contains a header for
 use in the picker, specifically <i>Showing X of Y matching groups</i>.
 <p>
 The number of groups returned is limited by the system property "jira.ajax.autocomplete.limit"
 <p>
 The groups will be unique and sorted.
[config & [opts]]
(jira-request config method))
(defn getStatuses
Returns a list of all statuses
[config & [opts]]
(jira-request config method))
(defn getAllSystemAvatars
Returns all system avatars of the given type.
[config & [opts]]
(jira-request config method))
(defn getAttachment
Returns the meta-data for an attachment, including the URI of the actual attached file.
[config & [opts]]
(jira-request config method))
(defn getPriority
Returns an issue priority.
[config & [opts]]
(jira-request config method))
(defn getProjectComponents
Contains a full representation of a the specified project's components.
[config & [opts]]
(jira-request config method))
(defn canMoveSubTask

[config & [opts]]
(jira-request config method))
(defn getPropertiesKeys
Returns the keys of all properties for the user identified by the key or by the id.
[config & [opts]]
(jira-request config method))
(defn getStatus
Returns a full representation of the Status having the given id or name.
[config & [opts]]
(jira-request config method))
(defn getIssueSecuritySchemes
Returns all issue security schemes that are defined.
[config & [opts]]
(jira-request config method))
(defn getProgress
Retrieves the progress of a single reindex request.
[config & [opts]]
(jira-request config method))
(defn getTransitions
Get a list of the transitions possible for this issue by the current user, along with fields that are required and their types.
 <p/>
 Fields will only be returned if <code>expand=transitions.fields</code>.
 <p/>
 The fields in the metadata correspond to the fields in the transition screen for that transition.
 Fields not in the screen will not be in the metadata.
[config & [opts]]
(jira-request config method))
(defn getWorklog
Returns a specific worklog. <br/>
 <strong>Note:</strong> The work log won't be returned if the Log work field is hidden for the project.
[config & [opts]]
(jira-request config method))
(defn getPropertyKeys
Returns the keys of all properties for the issue type identified by the id.
[config & [opts]]
(jira-request config method))
(defn findUsersWithAllPermissions
Returns a list of active users that match the search string and have all specified permissions for the project or issue.<br>
 This resource can be accessed by users with ADMINISTER_PROJECT permission for the project or global ADMIN or SYSADMIN rights.
[config & [opts]]
(jira-request config method))
(defn getDefaultShareScope
Returns the default share scope of the logged-in user.
[config & [opts]]
(jira-request config method))
(defn defaultColumns
Returns the default columns for the given filter. Currently logged in user will be used as
 the user making such request.
[config & [opts]]
(jira-request config method))
(defn getDraftIssueType
Returns the issue type mapping for the passed draft workflow scheme.
[config & [opts]]
(jira-request config method))
(defn getConfiguration
Returns the information if the optional features in Jira are enabled or disabled. If the time tracking is enabled,
 it also returns the detailed information about time tracking configuration.
[config & [opts]]
(jira-request config method))
(defn getAllTabs
Returns a list of all tabs for the given screen
[config & [opts]]
(jira-request config method))
(defn getStatusCategory
Returns a full representation of the StatusCategory having the given id or key
[config & [opts]]
(jira-request config method))
(defn downloadEmailTemplates
Creates a zip file containing email templates at local home and returns the file.
[config & [opts]]
(jira-request config method))
(defn getAlternativeIssueTypes
Returns a list of all alternative issue types for the given issue type id. The list will contain these issues types, to which
 issues assigned to the given issue type can be migrated. The suitable alternatives are issue types which are assigned
 to the same workflow, the same field configuration and the same screen scheme.
[config & [opts]]
(jira-request config method))
(defn getComment
Returns a single comment.
[config & [opts]]
(jira-request config method))
(defn getComponent
Returns a project component.
[config & [opts]]
(jira-request config method))
(defn getEmailTypes
Returns a list of root templates mapped with Event Types. The list can be used to decide which test emails to send.
[config & [opts]]
(jira-request config method))
(defn getDefault
Return the default workflow from the passed workflow scheme.
[config & [opts]]
(jira-request config method))
(defn getAllTerminologyEntries
Returns the list of all defined names for the default words "epic" and "sprint".
[config & [opts]]
(jira-request config method))
(defn getProjectRoles
Returns all roles in the given project Id or key, with links to full details on each role.
[config & [opts]]
(jira-request config method))
(defn getIssue
Returns a full representation of the issue for the given issue key.
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
 After including <code>versionedRepresentations</code> "fields" field become hidden.</li>
 </ul>
[config & [opts]]
(jira-request config method))
(defn getRemoteIssueLinkById
Get the remote issue link with the given id on the issue.
[config & [opts]]
(jira-request config method))
(defn getRemoteVersionLinks
Returns the remote version links for a given global ID.
[config & [opts]]
(jira-request config method))
(defn getIssueSecurityScheme
Returns the issue security scheme for project.
[config & [opts]]
(jira-request config method))
(defn validateUserAnonymization
Validates user anonymization process.
[config & [opts]]
(jira-request config method))
(defn getIdsOfWorklogsModifiedSince
Returns worklogs id and update time of worklogs that was updated since given time.
 The returns set of worklogs is limited to 1000 elements.
 This API will not return worklogs updated during last minute.
[config & [opts]]
(jira-request config method))
(defn getDraftById
Returns the requested draft workflow scheme to the caller.
[config & [opts]]
(jira-request config method))
(defn getIssueLinkType
Returns for a given issue link type id all information about this issue link type.
[config & [opts]]
(jira-request config method))
(defn getPermissionSchemeGrants
Returns all permission grants of the given permission scheme.
[config & [opts]]
(jira-request config method))
(defn getAvailableMetrics

[config & [opts]]
(jira-request config method))
(defn getIssueTypeScheme
Returns a full representation of the issue type scheme that has the given id (must be admin).
[config & [opts]]
(jira-request config method))
(defn getIssueSecurityScheme
Returns the issue security scheme along with that are defined.
[config & [opts]]
(jira-request config method))
(defn getAllScreens
Gets available field screens
[config & [opts]]
(jira-request config method))
(defn getAllProjectTypes
Returns all the project types defined on the Jira instance, not taking into account whether
 the license to use those project types is valid or not.
[config & [opts]]
(jira-request config method))
(defn getUser
Returns a user. This resource cannot be accessed anonymously.
[config & [opts]]
(jira-request config method))
(defn areMetricsExposed

[config & [opts]]
(jira-request config method))
(defn getPreference
Returns preference of the currently logged in user. Preference key must be provided as input parameter (key). The
 value is returned exactly as it is. If key parameter is not provided or wrong - status code 404. If value is
 found  - status code 200.
[config & [opts]]
(jira-request config method))
(defn getTerminologyEntry
Returns epic or sprint name as specified in the {originalName} path param.
[config & [opts]]
(jira-request config method))
(defn findUsersWithBrowsePermission
Returns a list of active users that match the search string. This resource cannot be accessed anonymously
 and requires the Browse Users global permission.
 Given an issue key this resource will provide a list of users that match the search string and have
 the browse issue permission for the issue provided.
[config & [opts]]
(jira-request config method))
(defn getPermissions
Returns all permissions in the system and whether the currently logged in user has them. You can optionally provide a specific context to get permissions for
 (projectKey OR projectId OR issueKey OR issueId)
 <ul>
 <li> When no context supplied the project related permissions will return true if the user has that permission in ANY project </li>
 <li> If a project context is provided, project related permissions will return true if the user has the permissions in the specified project.
 For permissions that are determined using issue data (e.g Current Assignee), true will be returned if the user meets the permission criteria in ANY issue in that project </li>
 <li> If an issue context is provided, it will return whether or not the user has each permission in that specific issue</li>
 </ul>
 <p>
 NB: The above means that for issue-level permissions (EDIT_ISSUE for example), hasPermission may be true when no context is provided, or when a project context is provided,
 <b>but</b> may be false for any given (or all) issues. This would occur (for example) if Reporters were given the EDIT_ISSUE permission. This is because
 any user could be a reporter, except in the context of a concrete issue, where the reporter is known.
 </p>
 <p>
 Global permissions will still be returned for all scopes.
 </p>
 <p>
 Prior to version 6.4 this service returned project permissions with keys corresponding to com.atlassian.jira.security.Permissions.Permission constants.
 Since 6.4 those keys are considered deprecated and this service returns system project permission keys corresponding to constants defined in com.atlassian.jira.permission.ProjectPermissions.
 Permissions with legacy keys are still also returned for backwards compatibility, they are marked with an attribute deprecatedKey=true.
 The attribute is missing for project permissions with the current keys.
 </p>
[config & [opts]]
(jira-request config method))
(defn getAllNodes

[config & [opts]]
(jira-request config method))
(defn getPropertiesKeys
Returns the keys of all properties for the comment identified by the key or by the id.
[config & [opts]]
(jira-request config method))
(defn getVersion
Returns a project version.
[config & [opts]]
(jira-request config method))
(defn getIssuePickerResource
Returns suggested issues which match the auto-completion query for the user which executes this request. This REST
 method will check the user's history and the user's browsing context and select this issues, which match the query.
[config & [opts]]
(jira-request config method))
(defn getAllIssueTypeSchemes
Returns a list of all issue type schemes visible to the user (must be admin).
 <p>
     All issue types associated with the scheme will only be returned if an additional query parameter is provided:
     <code>expand=schemes.issueTypes</code>.
 </p>
 <p>
     Similarly, the default issue type associated with the scheme (if one exists) will only be returned if
     additional an query parameter is provided: <code>expand=schemes.defaultIssueType</code>.
 </p>
 <p>
     Note that both query parameters can be used together: <code>expand=schemes.issueTypes,schemes.defaultIssueType</code>.
 </p>
[config & [opts]]
(jira-request config method))
(defn getRemoteVersionLink
A REST sub-resource representing a remote version link
[config & [opts]]
(jira-request config method))
(defn getAll
Returns all ApplicationRoles in the system. Will also return an ETag header containing a version hash of the
 collection of ApplicationRoles.
[config & [opts]]
(jira-request config method))
(defn currentUser
Returns information about the currently authenticated user's session. If the caller is not authenticated they
 will get a 401 Unauthorized status code.
[config & [opts]]
(jira-request config method))
(defn getVersionRelatedIssues
Returns a bean containing the number of fixed in and affected issues for the given version.
[config & [opts]]
(jira-request config method))
