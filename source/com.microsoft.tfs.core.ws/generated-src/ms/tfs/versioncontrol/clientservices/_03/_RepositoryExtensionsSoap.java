// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /serviceInterface.vm template.
 */
package ms.tfs.versioncontrol.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.exceptions.*;
import com.microsoft.tfs.core.ws.runtime.types.*;

import ms.tfs.versioncontrol.clientservices._03._ArtifactPropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ArtifactSpec;
import ms.tfs.versioncontrol.clientservices._03._BranchObject;
import ms.tfs.versioncontrol.clientservices._03._BranchObjectOwnership;
import ms.tfs.versioncontrol.clientservices._03._BranchProperties;
import ms.tfs.versioncontrol.clientservices._03._Change;
import ms.tfs.versioncontrol.clientservices._03._ChangeRequest;
import ms.tfs.versioncontrol.clientservices._03._ChangeType;
import ms.tfs.versioncontrol.clientservices._03._Changeset;
import ms.tfs.versioncontrol.clientservices._03._ChangesetSummary;
import ms.tfs.versioncontrol.clientservices._03._CheckinNote;
import ms.tfs.versioncontrol.clientservices._03._CheckinNoteFieldValue;
import ms.tfs.versioncontrol.clientservices._03._CheckinNotificationInfo;
import ms.tfs.versioncontrol.clientservices._03._CheckinNotificationWorkItemInfo;
import ms.tfs.versioncontrol.clientservices._03._CheckinResult;
import ms.tfs.versioncontrol.clientservices._03._CheckinWorkItemAction;
import ms.tfs.versioncontrol.clientservices._03._Conflict;
import ms.tfs.versioncontrol.clientservices._03._ConflictType;
import ms.tfs.versioncontrol.clientservices._03._DeletedState;
import ms.tfs.versioncontrol.clientservices._03._ExtendedMerge;
import ms.tfs.versioncontrol.clientservices._03._Failure;
import ms.tfs.versioncontrol.clientservices._03._GetOperation;
import ms.tfs.versioncontrol.clientservices._03._GetRequest;
import ms.tfs.versioncontrol.clientservices._03._Item;
import ms.tfs.versioncontrol.clientservices._03._ItemIdentifier;
import ms.tfs.versioncontrol.clientservices._03._ItemSpec;
import ms.tfs.versioncontrol.clientservices._03._ItemType;
import ms.tfs.versioncontrol.clientservices._03._LockLevel;
import ms.tfs.versioncontrol.clientservices._03._Mapping;
import ms.tfs.versioncontrol.clientservices._03._MergeSource;
import ms.tfs.versioncontrol.clientservices._03._PendingChange;
import ms.tfs.versioncontrol.clientservices._03._PolicyFailureInfo;
import ms.tfs.versioncontrol.clientservices._03._PolicyOverrideInfo;
import ms.tfs.versioncontrol.clientservices._03._PropertyValue;
import ms.tfs.versioncontrol.clientservices._03._ProxyInfo;
import ms.tfs.versioncontrol.clientservices._03._RecursionType;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_AddProxy;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_AddProxyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_CheckIn;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_CheckInResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_CheckInShelveset;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_CheckInShelvesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_DeleteBranchObject;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_DeleteBranchObjectResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_DeleteProxy;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_DeleteProxyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_Get;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_GetChangesetProperty;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_GetChangesetPropertyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_GetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_GetVersionedItemProperty;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_GetVersionedItemPropertyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_Merge;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_MergeResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_PendChanges;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_PendChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryBranchObjectOwnership;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryBranchObjectOwnershipResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryBranchObjects;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryBranchObjectsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryChangesForChangeset;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryChangesForChangesetResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryChangesetExtended;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryChangesetExtendedResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryMergeRelationships;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryMergeRelationshipsResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryMergesExtended;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryMergesExtendedResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryPendingChangesForWorkspace;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryPendingChangesForWorkspaceResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryProxies;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_QueryProxiesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_ResetCheckinDates;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_ResetCheckinDatesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_Resolve;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_ResolveResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_Rollback;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_RollbackResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_SetChangesetProperty;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_SetChangesetPropertyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_SetPendingChangeProperty;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_SetPendingChangePropertyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_SetVersionedItemProperty;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_SetVersionedItemPropertyResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_TrackMerges;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_TrackMergesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_UndoPendingChanges;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_UndoPendingChangesResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_Unshelve;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_UnshelveResponse;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_UpdateBranchObject;
import ms.tfs.versioncontrol.clientservices._03._RepositoryExtensionsSoap_UpdateBranchObjectResponse;
import ms.tfs.versioncontrol.clientservices._03._RequestType;
import ms.tfs.versioncontrol.clientservices._03._Resolution;
import ms.tfs.versioncontrol.clientservices._03._SeverityType;
import ms.tfs.versioncontrol.clientservices._03._Shelveset;
import ms.tfs.versioncontrol.clientservices._03._VersionControlLink;
import ms.tfs.versioncontrol.clientservices._03._VersionSpec;
import ms.tfs.versioncontrol.clientservices._03._Warning;
import ms.tfs.versioncontrol.clientservices._03._WarningType;
import ms.tfs.versioncontrol.clientservices._03._WorkingFolderType;

import java.lang.Object;
import java.lang.String;

import java.util.Calendar;

/**
 * Automatically generated service interface.
 *
 * {http://schemas.microsoft.com/TeamFoundation/2005/06/VersionControl/ClientServices/03}RepositoryExtensionsSoap
 */
public interface _RepositoryExtensionsSoap
{
    public _RepositoryExtensionsSoap_CheckInResponse checkIn(
        final String workspaceName,
        final String ownerName,
        final String[] serverItems,
        final _Changeset info,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final int checkinOptions,
        final boolean deferCheckIn,
        final int checkInTicket)
        throws TransportException, SOAPFault;

    public void resetCheckinDates(final Calendar lastCheckinDate)
        throws TransportException, SOAPFault;

    public void deleteBranchObject(final _ItemIdentifier rootItem)
        throws TransportException, SOAPFault;

    public _BranchObject[] queryBranchObjects(
        final _ItemIdentifier item,
        final _RecursionType recursion)
        throws TransportException, SOAPFault;

    public _BranchObjectOwnership[] queryBranchObjectOwnership(
        final int[] changesets,
        final _ItemSpec pathFilter)
        throws TransportException, SOAPFault;

    public void updateBranchObject(
        final _BranchProperties branchProperties,
        final boolean updateExisting)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_CheckInShelvesetResponse checkInShelveset(
        final String shelvesetName,
        final String ownerName,
        final String changesetOwner,
        final _CheckinNotificationInfo checkinNotificationInfo,
        final int checkinOptions)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_RollbackResponse rollback(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final _VersionSpec itemVersion,
        final _VersionSpec from,
        final _VersionSpec to,
        final int rollbackOptions,
        final _LockLevel lockLevel,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _ProxyInfo[] queryProxies(final String[] proxyUrls)
        throws TransportException, SOAPFault;

    public void addProxy(final _ProxyInfo proxy)
        throws TransportException, SOAPFault;

    public void deleteProxy(final String proxyUrl)
        throws TransportException, SOAPFault;

    public _ArtifactPropertyValue getChangesetProperty(
        final int changesetId,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public void setChangesetProperty(
        final int changesetId,
        final _PropertyValue[] propertyValues)
        throws TransportException, SOAPFault;

    public _ArtifactPropertyValue[] getVersionedItemProperty(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs,
        final _VersionSpec versionSpec,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public void setVersionedItemProperty(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs,
        final _VersionSpec versionSpec,
        final _DeletedState deletedState,
        final _ItemType itemType,
        final _PropertyValue[] propertyValues)
        throws TransportException, SOAPFault;

    public _Changeset queryChangesetExtended(
        final int changesetId,
        final boolean includeChanges,
        final boolean generateDownloadUrls,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _Change[] queryChangesForChangeset(
        final int changesetId,
        final boolean generateDownloadUrls,
        final int pageSize,
        final _ItemSpec lastItem,
        final String[] propertyNameFilters,
        final boolean includeMergeSourceInfo)
        throws TransportException, SOAPFault;

    public _GetOperation[][] get(
        final String workspaceName,
        final String ownerName,
        final _GetRequest[] requests,
        final int maxResults,
        final int options,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_MergeResponse merge(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec source,
        final _ItemSpec target,
        final _VersionSpec from,
        final _VersionSpec to,
        final _LockLevel lockLevel,
        final int optionsEx,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_QueryPendingChangesForWorkspaceResponse queryPendingChangesForWorkspace(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] itemSpecs,
        final boolean generateDownloadUrls,
        final int pageSize,
        final String lastChange,
        final boolean includeMergeInfo)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_UndoPendingChangesResponse undoPendingChanges(
        final String workspaceName,
        final String ownerName,
        final _ItemSpec[] items,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_UnshelveResponse unshelve(
        final String shelvesetName,
        final String shelvesetOwner,
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec[] items,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_ResolveResponse resolve(
        final String workspaceName,
        final String ownerName,
        final int conflictId,
        final _Resolution resolution,
        final String newPath,
        final int encoding,
        final _LockLevel lockLevel,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_PendChangesResponse pendChanges(
        final String workspaceName,
        final String ownerName,
        final _ChangeRequest[] changes,
        final int pendChangesOptions,
        final int supportedFeatures,
        final String[] propertyNameFilters)
        throws TransportException, SOAPFault;

    public _Failure[] setPendingChangeProperty(
        final String workspaceName,
        final String workspaceOwner,
        final _ArtifactPropertyValue[] pendingChangePropertyValues)
        throws TransportException, SOAPFault;

    public _ExtendedMerge[] queryMergesExtended(
        final String workspaceName,
        final String workspaceOwner,
        final _ItemSpec target,
        final _VersionSpec versionTarget,
        final _VersionSpec versionFrom,
        final _VersionSpec versionTo,
        final int options)
        throws TransportException, SOAPFault;

    public _RepositoryExtensionsSoap_TrackMergesResponse trackMerges(
        final int[] sourceChangesets,
        final _ItemIdentifier sourceItem,
        final _ItemIdentifier[] targetItems,
        final _ItemSpec pathFilter)
        throws TransportException, SOAPFault;

    public _ItemIdentifier[] queryMergeRelationships(final String serverItem)
        throws TransportException, SOAPFault;
}
